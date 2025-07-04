package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

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
    }