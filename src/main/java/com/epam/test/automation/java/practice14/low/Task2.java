package com.epam.test.automation.java.practice14.low;

import java.util.List;
import java.util.stream.Collectors;

public class Task2 {

    private Task2() {
    }

    public static List<Integer> sortAscLengthsOfStrings(List<String> stringList) {
        return stringList.stream()
                .mapToInt(String::length)
                .sorted()
                .boxed()
                .collect(Collectors.toList());
    }
}
