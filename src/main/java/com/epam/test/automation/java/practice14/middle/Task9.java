package com.epam.test.automation.java.practice14.middle;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task9 {

    private Task9() {
    }

    private static final List<String> firstList = List.of("ABC", "A", "BCD", "AMAZING", "AMAZING", "D");

    public static List<String> shouldReturnStringListWithLengthAndFirstLetter(List<String> stringList) {
        return stringList.stream()
                .collect(Collectors.groupingBy(str -> String.valueOf(str.charAt(0)),
                        Collectors.summingLong(String::length)))
                .entrySet().stream()
                    .sorted(Comparator.comparing(Map.Entry::getValue, Comparator.reverseOrder()))
                    .map(stringLongEntry -> stringLongEntry.getValue() + "-" + stringLongEntry.getKey())
                    .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        System.out.println(shouldReturnStringListWithLengthAndFirstLetter(firstList));
    }
}
