package com.example.test.functional;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapSortingRest {

    public static void main(String[] args) {
        Map<Integer, String> m = new TreeMap<>((i1, i2) -> (i1 > i2) ? -1 : (i1 < i2) ? +1 : 0);
        m.put(200, "sunny");
        m.put(100, "bunny");
        m.put(400, "asha");
        m.put(300, "sarath");
        System.out.println("Print map in ascending order : " + m);


    }
}
