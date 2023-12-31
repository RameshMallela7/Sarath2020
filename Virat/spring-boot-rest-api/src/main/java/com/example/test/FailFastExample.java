package com.example.test;

import java.util.ArrayList;
import java.util.List;

public class FailFastExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        for (String value : list) {
            System.out.println(value);
            list.add("D"); // You are using ArrayList and trying to update list then you will get ConcurrentModificationException
        }
    }
}
