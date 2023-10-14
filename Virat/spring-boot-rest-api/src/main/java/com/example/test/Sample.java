package com.example.test;

public class Sample {

    public boolean validateInput(String userInput) {
        return userInput.matches("\\d{4,}\\.\\d+");
    }
}
