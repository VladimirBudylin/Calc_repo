package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullSource;

import static org.junit.jupiter.api.Assertions.assertNotNull;


public class AssertTest {
    @ParameterizedTest
    @NullSource
    @DisplayName(value= "AssertionsTest")
    public void assertTest(String str){
        str="строка";
        assertNotNull(str, "str не null");
    }

}
