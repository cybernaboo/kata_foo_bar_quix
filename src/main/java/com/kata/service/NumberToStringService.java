package com.kata.service;

public class NumberToStringService {
    String Result;
    public String convertNumberToString(int inputNumber) {
        Result="";
        if (inputNumber==0){
            return "0";
        }
        if (inputNumber % 3 == 0) {
            Result += "FOO";
        }
        if (inputNumber % 5 == 0) {
            Result += "BAR";
        }
        for (char letter : String.valueOf(inputNumber).toCharArray()) {
            switch(letter){
                case '3' :Result+= "FOO";break;
                case '5' :Result+= "BAR";break;
                case '7' :Result+= "QUIX";break;
            }
        }
        if (Result == ""){
            Result=String.valueOf(inputNumber);
        }
        return Result;
    }
}
