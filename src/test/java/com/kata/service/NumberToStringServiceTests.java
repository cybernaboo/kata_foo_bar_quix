package com.kata.service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals; // Pour vérifier une égalité
public class NumberToStringServiceTests {
    NumberToStringService numberToStringService = new NumberToStringService();
    @Test
    void should_return_Incorrect_value_for_input_negative_1(){
        String inputValue = "-1";
        String expectedValue = "Incorrect value number : out of range 0-100";
        String outputValue  = numberToStringService.ConvertNumberToString(inputValue);
        assertEquals(expectedValue, outputValue);
    }
    @Test
    void should_return_Incorrect_value_for_input_101(){
        String inputValue = "101";
        String expectedValue = "Incorrect value number : out of range 0-100";
        String outputValue  = numberToStringService.ConvertNumberToString(inputValue);
        assertEquals(expectedValue, outputValue);
    }
    @Test
    void should_return_0_for_input_0(){
        String inputValue = "0";
        String expectedValue = "\"0\"";
        String outputValue  = numberToStringService.ConvertNumberToString(inputValue);
        assertEquals(expectedValue, outputValue);
    }
    @Test
    void should_return_BAR_for_input_100(){
        String inputValue = "100";
        String expectedValue = "BAR";
        String outputValue  = numberToStringService.ConvertNumberToString(inputValue);
        assertEquals(expectedValue, outputValue);
    }
    @Test
    void should_return_1_for_input_1(){
        String inputValue = "1";
        String expectedValue = "\"1\"";
        String outputValue  = numberToStringService.ConvertNumberToString(inputValue);
        assertEquals(expectedValue, outputValue);
    }
    @Test
    void should_return_FOUFOU_for_input_3(){
        String inputValue = "3";
        String expectedValue = "FOOFOO";
        String outputValue  = numberToStringService.ConvertNumberToString(inputValue);
        assertEquals(expectedValue, outputValue);
    }
    @Test
    void should_return_BARBAR_for_input_5(){
        String inputValue = "5";
        String expectedValue = "BARBAR";
        String outputValue  = numberToStringService.ConvertNumberToString(inputValue);
        assertEquals(expectedValue, outputValue);
    }
    @Test
    void should_return_QUIX_for_input_7(){
        String inputValue = "7";
        String expectedValue = "QUIX";
        String outputValue  = numberToStringService.ConvertNumberToString(inputValue);
        assertEquals(expectedValue, outputValue);
    }

    @Test
    void should_return_FOO_for_input_9(){
        String inputValue = "9";
        String expectedValue = "FOO";
        String outputValue  = numberToStringService.ConvertNumberToString(inputValue);
        assertEquals(expectedValue, outputValue);
    }
    @Test
    void should_return_FOOBAR_for_input_51(){
        String inputValue = "51";
        String expectedValue = "FOOBAR";
        String outputValue  = numberToStringService.ConvertNumberToString(inputValue);
        assertEquals(expectedValue, outputValue);
    }

    @Test
    void should_return_BARFOO_for_input_53(){
        String inputValue = "53";
        String expectedValue = "BARFOO";
        String outputValue  = numberToStringService.ConvertNumberToString(inputValue);
        assertEquals(expectedValue, outputValue);
    }
    @Test
    void should_return_FOOFOOFOO_for_input_33(){
        String inputValue = "33";
        String expectedValue = "FOOFOOFOO";
        String outputValue  = numberToStringService.ConvertNumberToString(inputValue);
        assertEquals(expectedValue, outputValue);
    }
    @Test
    void should_return_FOOBARBAR_for_input_15(){
        String inputValue = "15";
        String expectedValue = "FOOBARBAR";
        String outputValue  = numberToStringService.ConvertNumberToString(inputValue);
        assertEquals(expectedValue, outputValue);
    }
    @Test
    void should_return_FOOBARQUIXBAR_for_input_75(){
        String inputValue = "75";
        String expectedValue = "FOOBARQUIXBAR";
        String outputValue  = numberToStringService.ConvertNumberToString(inputValue);
        assertEquals(expectedValue, outputValue);
    }
    @Test
    void should_return_QUIXFOO_for_input_73(){
        String inputValue = "73";
        String expectedValue = "QUIXFOO";
        String outputValue  = numberToStringService.ConvertNumberToString(inputValue);
        assertEquals(expectedValue, outputValue);
    }
}
