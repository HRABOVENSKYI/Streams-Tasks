package com.epam.test.automation.java.practice14;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

import static com.epam.test.automation.java.practice14.low.Task4.filterAndSortByLastDigit;

public class Task4Test {

    private static final List<String> firstList = List.of("8DC3", "4F", "B", "3S", "S3", "A1", "2A3G", "1B");

    @Test
    public void testFilterAndSortByLastDigit() {
        Assert.assertEquals(filterAndSortByLastDigit(2, firstList), List.of("A1", "S3"));
    }
}
