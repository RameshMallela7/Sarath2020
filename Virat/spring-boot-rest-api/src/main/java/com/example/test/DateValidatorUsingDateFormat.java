package com.example.test;

import org.apache.commons.validator.GenericValidator;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;

public class DateValidatorUsingDateFormat {


    public static String isValid(String dateStr) {
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        sdf.setLenient(false);
        try {
            sdf.parse(dateStr);
        } catch (ParseException e) {
            return "Invalid date";
        }
        return "Valid date";
    }

    public static String isValidUsingLocalDate(String dateStr) {
        try {
            LocalDate localDate = LocalDate.parse(dateStr, DateTimeFormatter.ofPattern("MM/dd/yyyy")
                    .withResolverStyle(ResolverStyle.STRICT));
            System.out.println(localDate);
        } catch (DateTimeParseException e) {
            return "Invalid date";
        }
        return "Valid date";
    }



    public static void main(String[] args) {
        System.out.println(isValid("02/29/2024"));
        System.out.println(isValidUsingLocalDate("02/29/2024")); // Not working
        System.out.println(GenericValidator.isDate("02/29/2024", "MM/dd/yyyy", true));
    }


}


