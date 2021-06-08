package com.epam.test.automation.java.practice14;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

import static com.epam.test.automation.java.practice14.middle.Task10.getSortedLastLettersInUpperCase;

public class Task10Test {

    private static final List<String> firstList = List.of("asnsbiu", "asdsad", "asnsb", "asdf", "asdfb", "as", "a", "aop");
    private static final List<Character> secondList = List.of('U', 'D', 'B', 'B', 'F', 'P', 'S', 'A');

    @Test
    public void testGetSortedLastLettersInUpperCase() {
        Assert.assertEquals(getSortedLastLettersInUpperCase(firstList), secondList);
    }
}
