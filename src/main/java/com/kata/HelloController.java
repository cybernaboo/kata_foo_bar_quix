package com.kata;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String Hello() {
        return "Hello Naboo Kata!";
    }

    @GetMapping("/foobarquix")
    public String buildString() {
        return "foo";
    }
}