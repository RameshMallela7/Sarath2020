package com.example.test;

import java.util.Arrays;
import java.util.List;

public class StreamCountIncrementExample {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("Apple", "Banana", "Orange", "Grapes", "Mango");

        // Initialize the counter
        int[] count = {0};

        // Increment the count for each element in the stream
        fruits.forEach(fruit -> {
            // Your custom logic here if needed
            // For simplicity, we are just incrementing the count
            count[0]++;
        });

        // Displaying the result
        System.out.println("Number of elements: " + count[0]);
    }
}
