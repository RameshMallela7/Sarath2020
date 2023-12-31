package com.example.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Teststash {

    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println(date);

        LocalDateTime dateAntTime = LocalDateTime.now();
        System.out.println(dateAntTime);

        LocalTime time = LocalTime.now();
        System.out.println(time);

        LocalDate customLocalDate = LocalDate.of(2023, 12,31);
        System.out.println(customLocalDate);
    }
}
