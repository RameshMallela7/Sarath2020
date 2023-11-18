package com.example.test.functional;

public class Calculator implements CalculatorInterface{
    @Override
    public void sum(int a, int b) {
        System.out.println("The sum " + (a+b));
    }
}
