package com.epam.test.automation.java.practice14;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

import static com.epam.test.automation.java.practice14.low.Task5.getSortedAscOddValues;

public class Task5Test {

    private static final List<Integer> firstList = List.of(5, 2, 3, 4, 6, 1);

    @Test
    public void testGetSortedAscOddValues() {
        Assert.assertEquals(getSortedAscOddValues(firstList), List.of("1", "3", "5"));
    }
}