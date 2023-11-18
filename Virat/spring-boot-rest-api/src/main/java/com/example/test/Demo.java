package com.example.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Demo {

    public static void main(String[] args) {
        System.out.println(ternary(20));
    }

    private static String ternary(int age) {
        return age > 18 ? "adult" : "child";
    }

    private static void equals() {
        String str1 = "sarath";
        var str2 = "asha";
        if(str1.equals(str2)){
            System.out.println("Both strings are equal");
        } else {
            System.out.println("Both strings are notequal");
        }
    }

    private static void concurrentModificationException() {
        List<String> words = new ArrayList<>(Arrays.asList("a", "b", "c", "d"));
        words.removeIf(word -> word.equals("a"));
        System.out.println("Print words : " + words);
    }
}
