package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class CalcMinusTest {



    @Test
    @RepeatedTest(10)
    @DisplayName(value = "Проверка вычитания")

    void subb1 () {

        CalcMinus calculator = new CalcMinus();
            int result = calculator.CalcMinus (10,9);
            Assertions.assertEquals(1, result, "Ответ неверный");
        }



    @ParameterizedTest(name = "#{index} Вычитая {0} и {1} ожидаем {2}")
    @DisplayName(value = "Результат вычитания")
    @CsvSource ({ "10, 1,9", "100, 99, 1", "0, 0, 0"})
    void subb2(int c, int d , int subbResult) {
        CalcMinus calculator = new CalcMinus();
        int result = calculator.CalcMinus(c,d);
        Assertions.assertEquals(subbResult,result, "Ответ неверный");
    }
}


