package com.example.test;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.List;

@Slf4j
public class StreamsExamples {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10, 20, 25, 25, 40);
        log.info("list : {}", list);

        List<Integer> evenList = list.stream().filter(x -> x % 2 == 0).toList();
        log.info("even list : {}", evenList);

        List<Integer> distinctList = list.stream().distinct().toList();
        log.info("distinct list : {}", distinctList);

    }
}
