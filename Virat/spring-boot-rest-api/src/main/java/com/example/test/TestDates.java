package com.example.test;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.Random;

public class TestDates {

    public static void main(String[] args) {
        System.out.println(LocalDate.now());
        Random random = new Random();
        long l = System.currentTimeMillis() + random.nextInt(5);
        System.out.println(new Timestamp(l));
    }
}
