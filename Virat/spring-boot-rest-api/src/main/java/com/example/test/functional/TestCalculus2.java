package com.example.test.functional;

public class TestCalculus2 {
    public static void main(String[] args) {
        Calculus calculus = x-> x*x;
        System.out.println(calculus.squareIt(4));
        System.out.println(calculus.squareIt(5));
    }
}
