package com.example.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConcurrentModificationExceptionExample {
    public static void main(String[] args) {
        concurrentModificationException();
    }

    private static void concurrentModificationException() {
        List<String> list = new ArrayList<>(Arrays.asList("a", "b", "c", "d"));
        list.removeIf(word -> word.equals("a"));
        System.out.println("print list after remove : " + list);
    }
}
