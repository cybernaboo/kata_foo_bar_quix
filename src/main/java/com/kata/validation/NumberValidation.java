package com.kata.validation;
public class NumberValidation {
    private boolean isCorrectIntValue(String inputString){
        try {
            int convertedIntValue = Integer.parseInt(inputString);
        } catch (ClassCastException e) {
            return false;
        }
        return true;
    }
    private boolean isInTheCorrectRange(int inputNumber){
        return (inputNumber >= 0 && inputNumber <= 100);
    }
    public boolean isCorrectNumberValue(String inputString){
        return (isCorrectIntValue(inputString) && isInTheCorrectRange(Integer.parseInt(inputString)));
    }
}
