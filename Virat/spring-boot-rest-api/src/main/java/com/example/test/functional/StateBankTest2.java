package com.example.test.functional;

public class StateBankTest2 {
    public static void main(String[] args) {
        Bank bank = () -> System.out.println("State bank withdraw method");
        bank.withdraw();
    }
}
