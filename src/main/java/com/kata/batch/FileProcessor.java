package com.kata.batch;

import com.kata.service.*;
import com.kata.validation.NumberValidator;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FileProcessor {

    private NumberToStringService numberToStringService;
    private NumberValidator numberValidator;

    public FileProcessor(NumberToStringService numberToStringService, NumberValidator numberValidator) {
        this.numberToStringService = numberToStringService;
        this.numberValidator = numberValidator;
    }

    public void process(String inputFile, String outputFile, String errorFile) {
        List<String> linesOfInputFile = null;
        try {
            linesOfInputFile = Files.readAllLines(Paths.get(inputFile));
            List<String> results = linesOfInputFile.stream().filter(numberValidator::isCorrectNumberValue)
                    .map(fileLineValue -> fileLineValue + " \""
                            + numberToStringService.convertNumberToString(Integer.parseInt(fileLineValue)) + "\"")
                    .collect(Collectors.toList());
            List<String> errResults = linesOfInputFile.stream()
                    .filter(Predicate.not(numberValidator::isCorrectNumberValue)).collect(Collectors.toList());
            Files.write(Paths.get(outputFile), results);
            Files.write(Paths.get(errorFile), errResults);
        } catch (IOException e) {
            System.out.printf("Error during file processing : " + e.getMessage());
            throw new RuntimeException(e);
        }

    }
}
