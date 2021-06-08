package com.epam.test.automation.java.practice14;

import com.epam.test.automation.java.practice14.advanced.task15.CountryStat;
import com.epam.test.automation.java.practice14.advanced.task15.Good;
import com.epam.test.automation.java.practice14.advanced.task15.StorePrice;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.math.BigDecimal;
import java.util.List;

import static com.epam.test.automation.java.practice14.advanced.task15.Task15.name;

public class Task15Test {

    private static final List<Good> firstList = List.of(
            new Good(1, "milk", "Poland"),
            new Good(2, "milk", "Russia")
    );

    private static final List<StorePrice> secondList = List.of(
            new StorePrice(1, "BigShop", new BigDecimal("12.50")),
            new StorePrice(1, "SushiBar", new BigDecimal("10.50")),
            new StorePrice(2, "BigShop", new BigDecimal("12.50"))
    );

    private static final List<CountryStat> thirdList = List.of(
            new CountryStat("Poland", 2, new BigDecimal("10.50")),
            new CountryStat("Russia", 1, new BigDecimal("12.50"))
    );

    @Test
    public void testName() {
        Assert.assertEquals(name(firstList, secondList), thirdList);
    }
}