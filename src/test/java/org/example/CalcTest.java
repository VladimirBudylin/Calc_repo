package org.example;

import org.jetbrains.annotations.Contract;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalcTest {



    @BeforeAll
    public static void beginMessage(){
        System.out.println("Начало выполнения всех проверок");
    }



    @BeforeEach
    public void counterTest() {
        System.out.println("Начало отдельного теста");
    }



    @Contract(pure = true)
    @AfterAll
    public static void endMessage(){
        System.out.println("Проверки завершены");
    }



    @AfterEach
    public void nextTestMessage(){
        System.out.println("Переход к следующему тесту");
    }




    @Test
    @DisplayName(value = "Проверка сложения")
    @Timeout(value = 10)
    void TestSuiteSumm1() {
        CalcPlus calculator = new CalcPlus();
        int result = calculator.CalcPlus(99,1);
        assertEquals(100, result,"Ответ не равен 100");
    }



    @Test
    @DisplayName(value = "Проверка сложения2")
    @Timeout(value = 10)

    void TestSuiteSumm2() {
        CalcPlus calculator = new CalcPlus();
        int result = calculator.CalcPlus(99,1);
        assertEquals(100, result,"Сложение неверно");
    }


    @ParameterizedTest(name = " #{index} - сложение {0} и {1}, ожидаем {2}")
    @DisplayName(value = "Проверка сложения парамеритризированная")
    @CsvSource({"1, 2, 3", "-1, 2, 1","0, 0, 0"})
    @Tag("Param")

    void TestSuiteSumm3(int a, int b, int expectedResult) {
        CalcPlus calculator = new CalcPlus();
        int result = calculator.CalcPlus(a,b);
        assertEquals(expectedResult, result,"Ответ неверный");
    }

    @Test
    @DisplayName(value = "Проверка вычитания")

    void TestSuiteMinus1 () {

        CalcMinus calculator = new CalcMinus();
        int result = calculator.CalcMinus (10,9);
        assertEquals(1, result, "Сумма неверна");
    }



    @ParameterizedTest(name = "#{index} Вычитая {0} и {1} ожидаем {2}")
    @DisplayName(value = "Результат вычитания")
    @CsvSource ({ "10, 1,9", "100, 99, 1", "0, 0, 0"})
    void TestSuiteMinus2 (int c, int d , int subbResult) {
        CalcMinus calculator = new CalcMinus();
        int result = calculator.CalcMinus(c,d);
        Assertions.assertEquals(subbResult,result, "Ответ неверный");
    }
}
