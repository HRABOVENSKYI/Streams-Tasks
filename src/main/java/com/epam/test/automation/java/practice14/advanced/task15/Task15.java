package com.epam.test.automation.java.practice14.advanced.task15;

import java.math.BigDecimal;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task15 {

    private Task15() {
    }

    public static List<CountryStat> name(List<Good> goodList, List<StorePrice> storePriceList) {
        Map<Integer, List<StorePrice>> storesGroupedByProductSKU = storePriceList.stream()
                .collect(Collectors.groupingBy(StorePrice::getProductSKU));

        return storesGroupedByProductSKU.values().stream()
                .map(storePrices -> {
                    String countryOfOrigin = goodList.stream()
                            .filter(good -> storePrices.stream()
                                    .anyMatch(storePrice -> good.getProductSKU() == storePrice.getProductSKU()))
                            .findFirst().get().getCountryOfOrigin();

                    BigDecimal minPrice = storePrices.stream()
                            .min(Comparator.comparing(StorePrice::getPrice)).get().getPrice();

                    int numOfStoresInCountry = storePrices.size();

                    return new CountryStat(
                            countryOfOrigin,
                            numOfStoresInCountry,
                            minPrice
                    );
                })
                .sorted(Comparator.comparing(CountryStat::getCountryOfOrigin))
                .collect(Collectors.toList());
    }
}
