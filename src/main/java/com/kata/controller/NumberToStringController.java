package com.kata.controller;

import com.kata.service.NumberToStringService;
import com.kata.validation.NumberValidator;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NumberToStringController {
    @GetMapping("/numbertostring")
    public String buildString(@RequestParam("inputvalue") String inputString) {
        NumberToStringService numberToStringService = new NumberToStringService();
        NumberValidator numberValidator = new NumberValidator();
        String result = "";
        if (numberValidator.isCorrectNumberValue(inputString)) {
            result = numberToStringService.convertNumberToString(Integer.parseInt(inputString));
            return result;
        } else {
            return inputString;
        }
    }
}