package com.kata.validation;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberValidatorTest {

    NumberValidator numberValidator = new NumberValidator();
    @Test
    void should_return_false_for_input_negative_1(){
        String inputValue = "-1";
        boolean expectedValue = false;
        boolean outputValue  = numberValidator.isCorrectNumberValue(inputValue);
        assertEquals(expectedValue, outputValue);
    }
    @Test
    void should_return_false_for_input_101(){
        String inputValue = "101";
        boolean expectedValue = false;
        boolean outputValue  = numberValidator.isCorrectNumberValue(inputValue);
        assertEquals(expectedValue, outputValue);
    }

    @Test
    void should_return_true_for_input_0(){
        String inputValue = "0";
        boolean expectedValue = true;
        boolean outputValue  = numberValidator.isCorrectNumberValue(inputValue);
        assertEquals(expectedValue, outputValue);
    }
    @Test
    void should_return_true_for_input_100(){
        String inputValue = "100";
        boolean expectedValue = true;
        boolean outputValue  = numberValidator.isCorrectNumberValue(inputValue);
        assertEquals(expectedValue, outputValue);
    }
    @Test
    void should_return_true_for_input_50(){
        String inputValue = "50";
        boolean expectedValue = true;
        boolean outputValue  = numberValidator.isCorrectNumberValue(inputValue);
        assertEquals(expectedValue, outputValue);
    }
    @Test
    void should_return_false_for_input_A1(){
        String inputValue = "A1";
        boolean expectedValue = false;
        boolean outputValue  = numberValidator.isCorrectNumberValue(inputValue);
        assertEquals(expectedValue, outputValue);
    }
    @Test
    void should_return_false_for_input_2B(){
        String inputValue = "2B";
        boolean expectedValue = false;
        boolean outputValue  = numberValidator.isCorrectNumberValue(inputValue);
        assertEquals(expectedValue, outputValue);
    }
    @Test
    void should_return_false_for_input_1$(){
        String inputValue = "1$";
        boolean expectedValue = false;
        boolean outputValue  = numberValidator.isCorrectNumberValue(inputValue);
        assertEquals(expectedValue, outputValue);
    }
    @Test
    void should_return_false_for_empty_input(){
        String inputValue = "";
        boolean expectedValue = false;
        boolean outputValue  = numberValidator.isCorrectNumberValue(inputValue);
        assertEquals(expectedValue, outputValue);
    }
    @Test
    void should_return_false_for_blank_input(){
        String inputValue = " ";
        boolean expectedValue = false;
        boolean outputValue  = numberValidator.isCorrectNumberValue(inputValue);
        assertEquals(expectedValue, outputValue);
    }


}
