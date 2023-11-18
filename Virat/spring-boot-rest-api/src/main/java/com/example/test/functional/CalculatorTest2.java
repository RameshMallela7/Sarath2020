package com.example.test.functional;

public class CalculatorTest2 {
    public static void main(String[] args) {
        CalculatorInterface cal = (a, b) -> System.out.println("The sum " + (a + b));
        cal.sum(10, 20);
        cal.sum(30, 40);
    }
}
