package com.epam.test.automation.java.practice14.advanced.task14;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task14 {

    private Task14() {
    }

    public static List<ShopWithMaxDiscountOwner> getShopsWithMaxDiscountOwners
            (List<Supplier> supplierList, List<SupplierDiscount> supplierDiscountList) {
        Map<String, List<SupplierDiscount>> suppliersGroupedByShop = supplierDiscountList.stream()
                .collect(Collectors.groupingBy(SupplierDiscount::getStoreName));

        return suppliersGroupedByShop.entrySet().stream()
                .map(stringListEntry -> {
                    SupplierDiscount maxSupplierDiscount = stringListEntry.getValue().stream()
                            .max(Comparator.comparing(SupplierDiscount::getDiscountPercentage)
                                    .thenComparing(SupplierDiscount::getCustomerId).reversed()).get();

                    return new ShopWithMaxDiscountOwner(
                            stringListEntry.getKey(),
                            supplierList.stream()
                                    .filter(supplier -> supplier.getCustomerId() == maxSupplierDiscount.getCustomerId())
                                    .findFirst().get()
                    );
                })
                .sorted(Comparator.comparing(ShopWithMaxDiscountOwner::getStoreName))
                .collect(Collectors.toList());
    }
}
