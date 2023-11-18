package com.example.test.functional;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {
    public static void main(String[] args) {
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        System.out.println(timestamp);

        try {
            String dateTimeString = "";
            //String dateTimeString = "Oct 5, 2023, 12:13:44 AM";
            SimpleDateFormat dateFormat = new SimpleDateFormat("MMM d, yyyy, hh:mm:ss a");
            Date parsedDate = dateFormat.parse(dateTimeString);
            timestamp = new Timestamp(parsedDate.getTime());
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Timestamp: " + String.valueOf(timestamp));
    }
    public static void main01(String[] args) {
        String dateTimeString = "Oct 4, 2023, 12:13:44 AM";

        // Define the date format
        SimpleDateFormat dateFormat = new SimpleDateFormat("MMM d, yyyy, hh:mm:ss a");

        try {
            // Parse the date and time string
            Date parsedDate = dateFormat.parse(dateTimeString);

            // Convert the parsed date to a timestamp
            Timestamp timestamp = new Timestamp(parsedDate.getTime());

            System.out.println("Timestamp: " + String.valueOf(""));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
