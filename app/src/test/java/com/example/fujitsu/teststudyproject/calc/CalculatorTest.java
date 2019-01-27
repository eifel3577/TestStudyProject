package com.example.fujitsu.teststudyproject.calc;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void setUp() throws Exception {
        System.out.println("\r\nsetUp");
        calculator = new Calculator();
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("tearDown");
    }

    /**тестирование функции сложения */
    @Test
    public void add() throws Exception {
        System.out.println("add");
        assertEquals(9, calculator.add(6,3));
    }

    /**тестирование функции вычитания */
    @Test
    public void subtract() throws Exception {
        System.out.println("subtract");
        assertEquals(3, calculator.subtract(6,3));
    }

    /**тестирование функции умножения */
    @Test
    public void multiply() throws Exception {
        System.out.println("multiply");
        assertEquals(18, calculator.multiply(6,3));
    }

    /**тестирование функции деления */
    @Test
    public void divide() throws Exception {
        System.out.println("divide");
        assertEquals(2, calculator.divide(6,3));
    }
}