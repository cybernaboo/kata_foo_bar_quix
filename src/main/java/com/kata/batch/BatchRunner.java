package com.kata.batch;

import com.kata.service.NumberToStringService;
import com.kata.validation.NumberValidator;

import java.io.File;

public class BatchRunner {
    public static void main(String[] args){
        if (args.length < 3) {
            System.out.println("Requires two parameters : input file and output file");
            return;
        }
        String inputFile = args[0];
        String outputFile = args[1];
        String errorFile = args[2];

        NumberToStringService numberToStringService = new NumberToStringService();
        NumberValidator numberValidator = new NumberValidator();
        FileProcessor fileProcessor = new FileProcessor(numberToStringService, numberValidator);
        try {
            fileProcessor.process(inputFile, outputFile, errorFile);
        } catch (Exception e){
            System.out.println("Error during file processor : "+e.getMessage());
        }
    }
}
