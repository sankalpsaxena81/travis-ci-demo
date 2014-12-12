package com.travis.ci.demo;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void Add_shouldAdd_2_positiveNumbers() {
        Calculator calculator = new Calculator();

        assertEquals(3, calculator.add(1, 2));
    }

    @Test
    public void Add_shouldAdd_2_negativeNumbers() {
        Calculator calculator = new Calculator();

        assertEquals(-3, calculator.add(-1, -2));
    }
}