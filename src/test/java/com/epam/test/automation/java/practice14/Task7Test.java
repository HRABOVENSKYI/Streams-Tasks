package com.epam.test.automation.java.practice14;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

import static com.epam.test.automation.java.practice14.middle.Task7.getSortedDifferenceBetweenSubsets;

public class Task7Test {

    private static final List<Integer> firstList = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
    private static final List<Integer> secondList = List.of(9, 7, 4, 2);

    @Test
    public void testGetSortedDifferenceBetweenSubsets() {
        Assert.assertEquals(getSortedDifferenceBetweenSubsets(5, firstList), secondList);
    }
}
