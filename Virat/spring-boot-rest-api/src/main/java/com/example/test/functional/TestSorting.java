package com.example.test.functional;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestSorting {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        l.add(10);
        l.add(20);
        l.add(45);
        l.add(5);
        System.out.println("Print list : "+l);

        Collections.sort(l);
        System.out.println("Print list in ascending order : "+l);

        Collections.sort(l, new MyComparator());
        System.out.println("Print list in descending order : "+l);

        Collections.sort(l, (i1, i2) -> (i1 > i2) ? -1 : (i1 < i2) ? +1 : 0);
        System.out.println("Print list in descending order using lambda : "+l);

    }

}
