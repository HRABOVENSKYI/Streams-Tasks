package com.epam.test.automation.java.practice14.advanced.task13;

import com.epam.test.automation.java.practice14.advanced.Entrant;
import com.epam.test.automation.java.practice14.advanced.YearSchoolStat;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static com.epam.test.automation.java.practice14.advanced.task11.Task11.getYearSchoolStats;

public class Task13 {

    private Task13() {
    }

    public static List<YearSchoolStat> getYearSchoolStatList(List<Entrant> nameList, List<Integer> yearList) {
        List<Integer> allYearsFromNameList = getYearSchoolStats(nameList).stream()
                .map(YearSchoolStat::getYearOfEntering)
                .collect(Collectors.toList());

        return yearList.stream()
                .map(year -> {
                    if (allYearsFromNameList.contains(year)) {
                        List<YearSchoolStat> yearSchoolStats = getYearSchoolStats(nameList);

                        for (YearSchoolStat yearSchoolStat : yearSchoolStats) {
                            if (yearSchoolStat.getYearOfEntering() == year) {
                                return yearSchoolStat;
                            }
                        }
                    } else {
                        return new YearSchoolStat(year, 0);
                    }
                    return null;
                })
                .sorted(Comparator.comparing(YearSchoolStat::getNumberOfSchools).thenComparing(YearSchoolStat::getYearOfEntering))
                .collect(Collectors.toList());
    }
}