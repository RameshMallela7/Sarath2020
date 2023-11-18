package com.example.test.functional;

public class Car implements Vehicle{
    @Override
    public int getLength(String s) {
        return s.length();
    }
}
