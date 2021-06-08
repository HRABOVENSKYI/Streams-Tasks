package com.epam.test.automation.java.practice14;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

import static com.epam.test.automation.java.practice14.middle.Task9.shouldReturnStringListWithLengthAndFirstLetter;

public class Task9Test {

    private static final List<String> firstList = List.of("ABC", "A", "BCD", "AMAZING", "D");
    private static final List<String> secondList = List.of("11-A", "3-B", "1-D");

    @Test
    public void testShouldReturnStringListWithLengthAndFirstLetter() {
        Assert.assertEquals(shouldReturnStringListWithLengthAndFirstLetter(firstList), secondList);
    }
}
