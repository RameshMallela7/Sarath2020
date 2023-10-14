package com.example.test;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ExampleTest {

    @Test
    public void stringContainsMoreThan3Digits() {
        String userInput = String.valueOf(1234.4);
        assertTrue(userInput.matches("\\d{4,}\\.\\d+"));
    }


    @Test
    public void stringDoesNotContainsMoreThan3Digits() {
        String userInput = String.valueOf(123.4);
        assertFalse(userInput.matches("\\d{4,}\\.\\d+"));
    }

}
