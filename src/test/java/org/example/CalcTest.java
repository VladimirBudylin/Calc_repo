package org.example;

import org.jetbrains.annotations.Contract;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

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
    @RepeatedTest(10)
    @DisplayName(value = "Проверка сложения")
    @Timeout(value = 10)
    void summ1() {
        CalcPlus calculator = new CalcPlus();
        int result = calculator.CalcPlus(99,1);
        Assertions.assertEquals(100, result,"Ответ неверный");
    }



    @Test
    @DisplayName(value = "Проверка сложения2")
    @Timeout(value = 10)

    void summ2() {
        CalcPlus calculator = new CalcPlus();
        int result = calculator.CalcPlus(99,1);
        Assertions.assertEquals(100, result,"Ответ неверный");
    }


    @ParameterizedTest(name = " #{index} - сложение {0} и {1}, ожидаем {2}")
    @DisplayName(value = "Проверка сложения парамеритризированная")
    @CsvSource({"1, 2, 3", "-1, 2, 1","0, 0, 0"})
    @Tag("Param")

    void summ3(int a, int b, int expectedResult) {
        CalcPlus calculator = new CalcPlus();
        int result = calculator.CalcPlus(a,b);
        Assertions.assertEquals(expectedResult, result,"Ответ неверный");
    }
}