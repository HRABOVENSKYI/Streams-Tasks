package com.epam.test.automation.java.practice14.middle;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Task6 {

    private Task6() {
    }

    public static List<String> shouldReturnStringWithFirstLetterDigitAndLengthEqualsNumber
            (List<Integer> numbers, List<String> stringList) {
        List<String> allAcceptedStrings = new ArrayList<>();
        for (Integer num : numbers) {
            List<String> acceptedStrings = stringList.stream()
                    .filter(str -> Character.isDigit(str.charAt(0)) && str.length() == num)
                    .collect(Collectors.toList());
            if (!acceptedStrings.isEmpty()) {
                allAcceptedStrings.add(acceptedStrings.get(0));
            } else {
                allAcceptedStrings.add("Not Found");
            }
        }
        return allAcceptedStrings;
    }
}
