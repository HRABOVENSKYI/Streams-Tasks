package com.epam.test.automation.java.practice14.advanced.task12;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Task12 {

    private Task12() {
    }

    public static List<NumberPair> makeNumberPairsFromTwoList(List<Integer> integerList1, List<Integer> integerList2) {
        List<NumberPair> allNeededPairs = new ArrayList<>();

        for (Integer firstListNumber : integerList1) {
            Optional<Integer> neededNum = integerList2.stream()
                    .filter(num -> num % 10 == firstListNumber % 10)
                    .findAny();

            neededNum.ifPresent(integer -> allNeededPairs.add(new NumberPair(firstListNumber, integer)));
        }
        return allNeededPairs.stream()
                .sorted(Comparator.comparing(NumberPair::getValue1).thenComparing(NumberPair::getValue2))
                .collect(Collectors.toList());
    }
}
