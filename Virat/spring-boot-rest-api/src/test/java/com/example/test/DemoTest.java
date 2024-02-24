package com.example.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DemoTest {

    private Demo demo;

    @BeforeEach
    public void setUp() {
        demo = new Demo();
    }

    @Test
    public void removeElementFromListTest() {

        // Given
        List<String> words =  Stream.of("Geeks", "For", "Geeks").collect(Collectors.toList());

        // When
        List<String> result = demo.removeElementsFromList(words);

        // then
        assertEquals(new ArrayList<>(List.of("Geeks", "Geeks")), result);
    }

    @Test
    void removeAllTest() {
        // given
        List<Integer> list = new ArrayList<>(List.of(1, 1, 2, 3));
        int valueToRemove = 1;

        // when
        demo.removeAll(list, valueToRemove);

        // then
        assertThat(list).isEqualTo(new ArrayList<>(List.of(2, 3)));
    }
}
