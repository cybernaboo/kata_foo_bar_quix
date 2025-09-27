package com.kata.service;

public class NumberToStringService {
    String Result = "";
    int InputNumber;
    String ConvertNumberToString(String inputString) {
        try {
            InputNumber = Integer.parseInt(inputString);
        } catch (ClassCastException e) {
            return "Incorrect value number : not an integer";
        }
        if (InputNumber < 0 || InputNumber > 100) {
            return "Incorrect value number : out of range 0-100";
        }
        if (InputNumber==0){
            return "\"0\"";
        }
        if (InputNumber % 3 == 0) {
            Result += "FOO";
        }
        if (InputNumber % 5 == 0) {
            Result += "BAR";
        }
        for (char letter : inputString.toCharArray()) {
            if (letter == '3'){
                Result+= "FOO";
            }
            if (letter == '5'){
                Result+= "BAR";
            }
            if (letter == '7'){
                Result+= "QUIX";
            }
        }
        if (Result.isEmpty()){
            return ('"'+inputString+'"');
        }
        return Result;
    }
}
