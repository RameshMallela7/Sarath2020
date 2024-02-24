package com.example.test;

import java.util.List;
import java.util.Objects;

public class Demo {

    public List<String> removeElementsFromList(List<String> words) {
        words.removeIf(word -> word.equals("For"));
        return words;
    }

    void removeAll(List<Integer> list, int element) {
        list.removeIf(n -> Objects.equals(n, element));
    }

}
