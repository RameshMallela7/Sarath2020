package com.example.test;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimestampConversion {
    public static void main01(String[] args) throws ParseException {
        // Your database timestamp
        Timestamp dbTimestamp = new Timestamp(System.currentTimeMillis());

        // Convert the Timestamp to a formatted String
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String formattedTimestamp = sdf.format(dbTimestamp);

        // Print the formatted timestamp
        System.out.println("Formatted Timestamp: " + formattedTimestamp);

        // Parse the formatted string back to a Timestamp (if needed)
        Date parsedDate = sdf.parse(formattedTimestamp);
        Timestamp convertedTimestamp = new Timestamp(parsedDate.getTime());

        // Print the converted Timestamp
        System.out.println("Converted Timestamp: " + convertedTimestamp);
    }

    public static void main02(String[] args) {
        // Your database timestamp
        Timestamp dbTimestamp = new Timestamp(System.currentTimeMillis());

        // Convert the Timestamp to a Date
        Date date = new Date(dbTimestamp.getTime());

        // Define the desired format
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        // Format the date as a string
        String formattedDate = sdf.format(date);

        // Print the formatted date
        System.out.println("Formatted Timestamp: " + formattedDate);

        // If needed, you can convert the formatted string back to a Timestamp
        try {
            Date parsedDate = sdf.parse(formattedDate);
            Timestamp parsedTimestamp = new Timestamp(parsedDate.getTime());
            System.out.println("Parsed Timestamp: " + parsedTimestamp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        // Your database timestamp
        Timestamp dbTimestamp = new Timestamp(System.currentTimeMillis());

        // Define the desired format
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        // Format the Timestamp as a string
        String formattedTimestamp = sdf.format(dbTimestamp);

        Timestamp timestamp = Timestamp.valueOf(formattedTimestamp);
        // Print the formatted Timestamp
        System.out.println("Formatted Timestamp: " + timestamp);
    }


}
