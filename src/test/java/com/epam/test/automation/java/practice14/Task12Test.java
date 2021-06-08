package com.epam.test.automation.java.practice14;

import com.epam.test.automation.java.practice14.advanced.task12.NumberPair;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

import static com.epam.test.automation.java.practice14.advanced.task12.Task12.makeNumberPairsFromTwoList;

public class Task12Test {

    private static final List<Integer> firstList = List.of(1, 2, 3, 44, 6, 77);
    private static final List<Integer> secondList = List.of(11, 22, 56, 33, 36, 17);
    private static final List<NumberPair> thirdList = List.of(
            new NumberPair(1, 11),
            new NumberPair(2, 22),
            new NumberPair(3, 33),
            new NumberPair(6, 56),
            new NumberPair(77, 17)
    );

    @Test
    public void testMakeNumberPairsFromTwoList() {
        Assert.assertEquals(makeNumberPairsFromTwoList(firstList, secondList), thirdList);
    }
}