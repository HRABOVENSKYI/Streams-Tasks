package com.epam.test.automation.java.practice14;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

import static com.epam.test.automation.java.practice14.low.Task2.sortAscLengthsOfStrings;

public class Task2Test {

    private static final List<String> firstList = List.of("Hello", "world", "!", "Good", "morning", "!");

    @Test
    public void testSortAscLengthsOfStrings() {
        Assert.assertEquals(sortAscLengthsOfStrings(firstList), List.of(1, 1, 4, 5, 5, 7));
    }
}