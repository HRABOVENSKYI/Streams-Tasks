package com.epam.test.automation.java.practice14;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

import static com.epam.test.automation.java.practice14.low.Task1.filterByFirstAndLastCharacter;

public class Task1Test {

    private static final List<String> firstList = List.of("asia", "bad", "our logo", "nice car", "ya ay", "o, no", "o");

    @Test
    public void testFilterByFirstAndLastCharacter() {
        Assert.assertEquals(filterByFirstAndLastCharacter('o', firstList), List.of("our logo", "o, no"));
        Assert.assertEquals(filterByFirstAndLastCharacter('a', firstList), List.of("asia"));
    }
}
