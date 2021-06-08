package com.epam.test.automation.java.practice14;

import com.epam.test.automation.java.practice14.advanced.Entrant;
import com.epam.test.automation.java.practice14.advanced.YearSchoolStat;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

import static com.epam.test.automation.java.practice14.advanced.task13.Task13.getYearSchoolStatList;

public class Task13Test {

    private static final List<Entrant> firstList = List.of(
            new Entrant(11, 2003, "Ivanov"),
            new Entrant(11, 2001, "Petrov"),
            new Entrant(11, 2001, "Pupkin"),
            new Entrant(10, 1999, "Zobkin"),
            new Entrant(10, 1999, "Zabkin"),
            new Entrant(10, 1999, "Ivanov"),
            new Entrant(10, 2000, "Petrov"),
            new Entrant(14, 2001, "Pupkin"),
            new Entrant(15, 2000, "Zobkin"),
            new Entrant(10, 2000, "Ivanov"),
            new Entrant(12, 2003, "Petrov"),
            new Entrant(11, 2003, "Pupkin"),
            new Entrant(10, 2003, "Zobkin")
    );

    private static final List<Integer> secondList = List.of(2001, 1999, 2000, 2002, 2003);

    private static final List<YearSchoolStat> thirdList = List.of(
            new YearSchoolStat(2002, 0),
            new YearSchoolStat(1999, 1),
            new YearSchoolStat(2000, 2),
            new YearSchoolStat(2001, 2),
            new YearSchoolStat(2003, 3)
    );

    @Test
    public void testGetYearSchoolStatList() {
        Assert.assertEquals(getYearSchoolStatList(firstList, secondList), thirdList);
    }
}
