package com.example.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SampleTest {

    private Sample sample;

    @BeforeEach
    public void setUp() {
        sample = new Sample();
    }

    @Test
    public void stringDoesNotContainsMoreThan3Digits() {
        // Test when input has less than 3 digits before the decimal point
        boolean result3 = sample.validateInput("12.345");
        assertFalse(result3);
    }

    @Test
    public void stringContainsMoreThan3Digits() {
        // Test when input has more than 3 digits before the decimal point
        boolean result1 = sample.validateInput("1234.567");
        assertTrue(result1);
    }
}
