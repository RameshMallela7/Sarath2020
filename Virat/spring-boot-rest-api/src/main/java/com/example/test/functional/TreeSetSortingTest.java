package com.example.test.functional;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetSortingTest {
    public static void main(String[] args) {
        Set<Integer> t = new TreeSet<>((i1, i2) -> (i1 > i2) ? -1 : (i1 < i2) ? +1 : 0);
        t.add(10);
        t.add(20);
        t.add(45);
        t.add(5);
        System.out.println("Print list : " + t);
    }
}
