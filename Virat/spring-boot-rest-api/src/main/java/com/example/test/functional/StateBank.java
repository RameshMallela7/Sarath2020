package com.example.test.functional;

public class StateBank implements Bank{

    @Override
    public void withdraw() {
        System.out.printf("State bank withdraw method");
    }
}
