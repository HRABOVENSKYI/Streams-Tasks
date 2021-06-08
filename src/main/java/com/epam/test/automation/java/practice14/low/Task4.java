package com.epam.test.automation.java.practice14.low;

import java.util.List;
import java.util.stream.Collectors;

public class Task4 {

    private Task4() {
    }

    public static List<String> filterAndSortByLastDigit(int number, List<String> stringList) {
        return stringList.stream()
                .filter(str -> str.length() == number && Character.isDigit(str.charAt(str.length() - 1)))
                .sorted()
                .collect(Collectors.toList());
    }
}