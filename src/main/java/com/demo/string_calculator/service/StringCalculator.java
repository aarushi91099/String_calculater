package com.demo.string_calculator.service;

import org.springframework.stereotype.Service;

@Service
public class StringCalculator {

    public int add(String numbers){
        return numbers.isEmpty() ? 0 : Integer.parseInt(numbers);
    }

}
