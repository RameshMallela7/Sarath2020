package com.example.test;

import java.time.*;

public class Java8DateExamples {

    public static void main(String[] args) {

        // Date
        testLocalDate();

        // Time
        testLocalTime();

        // LocalDateTime
        testLocalDateTime();

        // testLocalDateTimeCustom
        LocalDateTime dateOfBirth = LocalDateTime.of(1991, Month.AUGUST, 1, 12, 45);
        System.out.println(dateOfBirth);

        // testZone
        testZones();

        testPeriod();


    }

    private static void testPeriod() {
        LocalDate birthDate = LocalDate.of(1990, 11, 1);
        LocalDate localDate = LocalDate.now();
        Period period = Period.between(birthDate, localDate);
        System.out.println(period.getYears() + " Years " + period.getMonths() + " Month " + period.getDays() + " Days ");
    }

    private static void testZones() {
        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println("Print zoneId : " + zoneId);

        ZoneId zoneIdOfAmerica = ZoneId.of("America/Los_Angeles");
        ZonedDateTime dateTimeOfAmerica = ZonedDateTime.now(zoneIdOfAmerica);
        System.out.println(dateTimeOfAmerica);
    }

    private static void testLocalDateTime() {
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);

        int yearUsingDateTime = dateTime.getYear();
        System.out.println(yearUsingDateTime);

        int monthUsingDateTime = dateTime.getMonthValue();
        System.out.println(monthUsingDateTime);

        int dayUsingDateTime = dateTime.getDayOfMonth();
        System.out.println(dayUsingDateTime);

        int hourUsingDateTime = dateTime.getHour();
        System.out.println(hourUsingDateTime);

        int minuteUsingDateTime = dateTime.getMinute();
        System.out.println(minuteUsingDateTime);

        int secondUsingDateTime = dateTime.getSecond();
        System.out.println(secondUsingDateTime);

        int nanoUsingDateTime = dateTime.getNano();
        System.out.println(nanoUsingDateTime);

        System.out.println("Date after 6 months: " + dateTime.plusMonths(6));
        System.out.println("Date before 6 months: " + dateTime.minusMonths(6));
        System.out.println("Add 2 days to current date: " + dateTime.plusDays(2));
    }

    private static void testLocalTime() {
        LocalTime time = LocalTime.now();
        System.out.println(time);

        int hour = time.getHour();
        System.out.println(hour);

        int minute = time.getMinute();
        System.out.println(minute);

        int second = time.getSecond();
        System.out.println(second);

        int nano = time.getNano();
        System.out.println(nano);
    }

    private static void testLocalDate() {
        LocalDate date = LocalDate.now();
        System.out.println(date);

        int year = date.getYear();
        System.out.println(year);

        int month = date.getMonthValue();
        System.out.println(month);

        int day = date.getDayOfMonth();
        System.out.println(day);
    }


}
