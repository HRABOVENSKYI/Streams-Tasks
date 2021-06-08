package com.epam.test.automation.java.practice14.advanced.task11;

import com.epam.test.automation.java.practice14.advanced.Entrant;
import com.epam.test.automation.java.practice14.advanced.YearSchoolStat;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Task11 {

    private Task11() {
    }

    public static List<YearSchoolStat> getYearSchoolStats(List<Entrant> entrantList) {
        Map<Integer, Long> yearAndNumberOfDifferentSchoolsApplicants = entrantList.stream()
                .filter(distinctByKeys(Entrant::getSchoolNumber, Entrant::getYearOfEntering))
                .collect(Collectors.groupingBy(Entrant::getYearOfEntering, Collectors.counting()));
        return yearAndNumberOfDifferentSchoolsApplicants.entrySet().stream()
                .map(yearNum -> new YearSchoolStat(yearNum.getKey(), yearNum.getValue().intValue()))
                .sorted(Comparator.comparing(YearSchoolStat::getNumberOfSchools)
                        .thenComparing(YearSchoolStat::getYearOfEntering))
                .collect(Collectors.toList());
    }

    @SafeVarargs
    private static <T> Predicate<T> distinctByKeys(Function<? super T, ?>... keyExtractors) {
        final Map<List<?>, Boolean> seen = new ConcurrentHashMap<>();

        return t -> {
            final List<?> keys = Arrays.stream(keyExtractors)
                    .map(ke -> ke.apply(t))
                    .collect(Collectors.toList());
            return seen.putIfAbsent(keys, Boolean.TRUE) == null;
        };
    }
}
