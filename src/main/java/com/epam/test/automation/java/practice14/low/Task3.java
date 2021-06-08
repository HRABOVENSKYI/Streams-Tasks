package com.epam.test.automation.java.practice14.low;

import java.util.List;
import java.util.stream.Collectors;

public class Task3 {

    private Task3() {
    }

    public static List<String> getListExtremeLetters(List<String> list) {
        return list.stream()
                .map(str -> String.valueOf(str.charAt(0)) + str.charAt(str.length() - 1))
                .collect(Collectors.toList());
    }
}
