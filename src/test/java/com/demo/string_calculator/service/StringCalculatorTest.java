package com.demo.string_calculator.service;


import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class StringCalculatorTest {

    StringCalculator calculator;

    @Test
    public void handlingEmptyString(){
        calculator = new StringCalculator();
        assertEquals(0,calculator.add(""));
    }

    @Test
    public void handlingSingleInputString(){
        calculator = new StringCalculator();
        assertEquals(1,calculator.add("1"));
    }

    @Test
    public void handlingDoubleInputString(){
        calculator = new StringCalculator();
        assertEquals(3,calculator.add("1,2"));
    }

    @Test
    public void handlingMultipleInputString(){
        calculator = new StringCalculator();
        assertEquals(7,calculator.add("1,2,4"));
    }

    @Test
    public void handlingNewLineInputString(){
        calculator = new StringCalculator();
        assertEquals(6,calculator.add("1,2\n3"));
    }
}
