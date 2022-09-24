package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.BeforeEach;
public class MainTest {

    Main calculator;
    @BeforeEach
    void setUp() {
        calculator = new Main();
    }
    @Test
    @DisplayName("Calculation should work")
    void IntegerMultiplyTest() {
        var calculator=new Main();
        int a = 10;
        int b = 20;
        assertEquals(200, calculator.multiply(a,b));
    }
    @RepeatedTest(7)
    @DisplayName("Considering handling of zero")
    void ZeroMultiplyTest() {

        assertEquals(0, calculator.multiply(77, 0));
        assertEquals(0, calculator.multiply(0, 11));
    }
}