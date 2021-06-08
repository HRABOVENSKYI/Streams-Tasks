package com.epam.test.automation.java.practice14.middle;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task7 {

    private Task7() {
    }

    public static List<Integer> getSortedDifferenceBetweenSubsets(int number, List<Integer> integerList) {
        List<Integer> concatBothSublist = Stream.concat(
                integerList.stream()
                        .filter(num -> num % 2 == 0),
                integerList.stream()
                        .skip(number)
        )
                .collect(Collectors.toList());

        return concatBothSublist.stream()
                .filter(num -> Collections.frequency(concatBothSublist, num) == 1)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
    }
}