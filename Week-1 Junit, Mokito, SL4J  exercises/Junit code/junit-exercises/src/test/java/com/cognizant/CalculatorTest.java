package com.cognizant;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    public void testAddition() {
        assertEquals(10, calculator.add(4, 6));
    }
}