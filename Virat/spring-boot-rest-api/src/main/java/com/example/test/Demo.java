package com.example.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Demo {

    public static void main(String[] args) {
        concurrentModificationException();
    }

    private static void concurrentModificationException() {
        List<String> words = new ArrayList<>(Arrays.asList("a", "b", "c", "d"));
        words.removeIf(word -> word.equals("a"));
        System.out.println("Print words : " + words);
    }
}
