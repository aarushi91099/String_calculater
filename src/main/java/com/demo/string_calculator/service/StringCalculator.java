package com.demo.string_calculator.service;

import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class StringCalculator {

    public int add(String numbers){
        if(numbers.isEmpty()){
            return 0;
        }
        String delimeters = ",|\n";
        if(numbers.startsWith("//")){
            delimeters = numbers.substring(2,3);
            numbers = numbers.substring(4);
        }
        String[] num = numbers.split(delimeters);
        int numSum = 0;
        numSum = Arrays.stream(num).mapToInt(Integer::parseInt).sum();
        return numSum;
    }

}
