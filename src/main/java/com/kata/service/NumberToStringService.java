package com.kata.service;

public class NumberToStringService {
    public String convertNumberToString(int inputNumber) {
        String result = "";
        if (inputNumber == 0) {
            return "0";
        }
        if (inputNumber % 3 == 0) {
            result += "FOO";
        }
        if (inputNumber % 5 == 0) {
            result += "BAR";
        }
        for (char letter : String.valueOf(inputNumber).toCharArray()) {
            switch (letter) {
                case '3':
                    result += "FOO";
                    break;
                case '5':
                    result += "BAR";
                    break;
                case '7':
                    result += "QUIX";
                    break;
            }
        }
        if (result == "") {
            result = String.valueOf(inputNumber);
        }
        return result;
    }
}
