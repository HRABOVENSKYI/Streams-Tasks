package com.epam.test.automation.java.practice14;

import com.epam.test.automation.java.practice14.advanced.Entrant;
import com.epam.test.automation.java.practice14.advanced.YearSchoolStat;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

import static com.epam.test.automation.java.practice14.advanced.task11.Task11.getYearSchoolStats;

public class Task11Test {

    private static final List<Entrant> firstList = List.of(
            new Entrant(1, 1993, "Ivanov"),
            new Entrant(2, 1992, "Petrov"),
            new Entrant(3, 1993, "Pupkin"),
            new Entrant(3, 2000, "Zobkin"),
            new Entrant(3, 2000, "Zabkin")
    );

    private static final List<YearSchoolStat> secondList = List.of(
            new YearSchoolStat(1992, 1),
            new YearSchoolStat(2000, 1),
            new YearSchoolStat(1993, 2)
    );

    @Test
    public void testGetYearSchoolStats() {
        Assert.assertEquals(getYearSchoolStats(firstList), secondList);
    }
}
