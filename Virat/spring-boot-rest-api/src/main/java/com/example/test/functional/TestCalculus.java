package com.example.test.functional;

public class TestCalculus {
    public static void main(String[] args) {
        Calculus calculus = new DemoCalculus();
        System.out.println(calculus.squareIt(4));
        System.out.println(calculus.squareIt(5));
    }
}
