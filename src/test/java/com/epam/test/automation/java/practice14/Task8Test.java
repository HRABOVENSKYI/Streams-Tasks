package com.epam.test.automation.java.practice14;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

import static com.epam.test.automation.java.practice14.middle.Task8.getSortedUnionTwoSubsetsIntegers;

public class Task8Test {

    private static final List<Integer> firstList = List.of(-10, 3, -3, 4, 55, 6);
    private static final List<Integer> secondList = List.of(55, 6, 4);

    @Test
    public void testGetSortedUnionTwoSubsetsIntegers() {
        Assert.assertEquals(getSortedUnionTwoSubsetsIntegers(3, 4, firstList), secondList);
    }
}