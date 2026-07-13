package com.cognizant;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorAAATest {

    Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
        System.out.println("Setup");
    }

    @After
    public void tearDown() {
        calculator = null;
        System.out.println("Cleanup");
    }

    @Test
    public void testAddition() {

        // Arrange
        int a = 20;
        int b = 30;

        // Act
        int result = calculator.add(a, b);

        // Assert
        assertEquals(50, result);
    }
}