package com.example.test.functional;

public class CarTest2 {
    public static void main(String[] args) {
        Vehicle v = s -> s.length();
        System.out.println(v.getLength("Car"));
    }
}
