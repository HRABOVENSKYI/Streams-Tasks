package com.epam.test.automation.java.practice14;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

import static com.epam.test.automation.java.practice14.middle.Task6.shouldReturnStringWithFirstLetterDigitAndLengthEqualsNumber;

public class Task6Test {

    private static final List<Integer> firstList = List.of(1, 3, 4);
    private static final List<String> secondList = List.of("1aa", "aaa", "1", "1bb", "a");

    @Test
    public void testShouldReturnStringWithFirstLetterDigitAndLengthEqualsNumber() {
        Assert.assertEquals(
                shouldReturnStringWithFirstLetterDigitAndLengthEqualsNumber(firstList, secondList),
                List.of("1", "1aa", "Not Found")
        );
    }
}
