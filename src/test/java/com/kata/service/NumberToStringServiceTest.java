package com.kata.service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals; // Pour vérifier une égalité

public class NumberToStringServiceTest {
    NumberToStringService numberToStringService = new NumberToStringService();

    @Test
    void should_return_0_for_input_0() {
        int inputValue = 0;
        String expectedValue = "0";
        String outputValue = numberToStringService.convertNumberToString(inputValue);
        assertEquals(expectedValue, outputValue);
    }

    @Test
    void should_return_BAR_for_input_100() {
        int inputValue = 100;
        String expectedValue = "BAR";
        String outputValue = numberToStringService.convertNumberToString(inputValue);
        assertEquals(expectedValue, outputValue);
    }

    @Test
    void should_return_1_for_input_1() {
        int inputValue = 1;
        String expectedValue = "1";
        String outputValue = numberToStringService.convertNumberToString(inputValue);
        assertEquals(expectedValue, outputValue);
    }

    @Test
    void should_return_FOUFOU_for_input_3() {
        int inputValue = 3;
        String expectedValue = "FOOFOO";
        String outputValue = numberToStringService.convertNumberToString(inputValue);
        assertEquals(expectedValue, outputValue);
    }

    @Test
    void should_return_BARBAR_for_input_5() {
        int inputValue = 5;
        String expectedValue = "BARBAR";
        String outputValue = numberToStringService.convertNumberToString(inputValue);
        assertEquals(expectedValue, outputValue);
    }

    @Test
    void should_return_QUIX_for_input_7() {
        int inputValue = 7;
        String expectedValue = "QUIX";
        String outputValue = numberToStringService.convertNumberToString(inputValue);
        assertEquals(expectedValue, outputValue);
    }

    @Test
    void should_return_FOO_for_input_9() {
        int inputValue = 9;
        String expectedValue = "FOO";
        String outputValue = numberToStringService.convertNumberToString(inputValue);
        assertEquals(expectedValue, outputValue);
    }

    @Test
    void should_return_FOOBAR_for_input_51() {
        int inputValue = 51;
        String expectedValue = "FOOBAR";
        String outputValue = numberToStringService.convertNumberToString(inputValue);
        assertEquals(expectedValue, outputValue);
    }

    @Test
    void should_return_BARFOO_for_input_53() {
        int inputValue = 53;
        String expectedValue = "BARFOO";
        String outputValue = numberToStringService.convertNumberToString(inputValue);
        assertEquals(expectedValue, outputValue);
    }

    @Test
    void should_return_FOOFOOFOO_for_input_33() {
        int inputValue = 33;
        String expectedValue = "FOOFOOFOO";
        String outputValue = numberToStringService.convertNumberToString(inputValue);
        assertEquals(expectedValue, outputValue);
    }

    @Test
    void should_return_FOOBARBAR_for_input_15() {
        int inputValue = 15;
        String expectedValue = "FOOBARBAR";
        String outputValue = numberToStringService.convertNumberToString(inputValue);
        assertEquals(expectedValue, outputValue);
    }

    @Test
    void should_return_FOOBARQUIXBAR_for_input_75() {
        int inputValue = 75;
        String expectedValue = "FOOBARQUIXBAR";
        String outputValue = numberToStringService.convertNumberToString(inputValue);
        assertEquals(expectedValue, outputValue);
    }

    @Test
    void should_return_QUIXFOO_for_input_73() {
        int inputValue = 73;
        String expectedValue = "QUIXFOO";
        String outputValue = numberToStringService.convertNumberToString(inputValue);
        assertEquals(expectedValue, outputValue);
    }
}
