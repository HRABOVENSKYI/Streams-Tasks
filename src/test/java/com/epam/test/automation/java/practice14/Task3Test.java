package com.epam.test.automation.java.practice14;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

import static com.epam.test.automation.java.practice14.low.Task3.getListExtremeLetters;

public class Task3Test {

    private static final List<String> firstList = List.of("asd", "a", "bow");

    @Test
    public void testGetListExtremeLetters() {
        Assert.assertEquals(getListExtremeLetters(firstList), List.of("ad", "aa", "bw"));
    }
}
