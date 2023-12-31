package com.example.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo {

    public static void main(String[] args) {
        concurrentModificationException();
        test1();
        test2();

    }

    private static void test2() {

    }

    private static void concurrentModificationException() {
        List<String> words = new ArrayList<>(Arrays.asList("a", "b", "c", "d"));
        words.removeIf(word -> word.equals("a"));
        System.out.println("Print words : " + words);
    }

    private static void test1() {
        List<String> words = new ArrayList<>();
        words.add("Virat");
        words.add("Anushka");
        words.add("cricket");
        System.out.println(words);
        words.removeIf(word -> word.equals("cricket"));
        System.out.println(words);
    }
}
