package com.example.test;

import org.springframework.util.CollectionUtils;

import java.util.List;

public class SortExample {
    public static void main(String[] args) {
        System.out.println(getOperator(List.of("sarath")));
        System.out.println(getOperator(List.of("sarath", "asha")));
    }

    public static String getOperator(List<String> values) {
        String operator = "BETWEEN";
        if (!CollectionUtils.isEmpty(values)) {
            // values.sort(String::compareTo); // This line failed if you use List.of()
            List<String> sortedValues = values.stream()
                    .sorted()
                    .toList();
            operator = sortedValues.size() == 1 ? "IN" : "BETWEEN";
        }
        return operator;
    }


}
