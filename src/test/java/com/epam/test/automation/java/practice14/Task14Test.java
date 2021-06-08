package com.epam.test.automation.java.practice14;

import com.epam.test.automation.java.practice14.advanced.task14.ShopWithMaxDiscountOwner;
import com.epam.test.automation.java.practice14.advanced.task14.Supplier;
import com.epam.test.automation.java.practice14.advanced.task14.SupplierDiscount;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

import static com.epam.test.automation.java.practice14.advanced.task14.Task14.getShopsWithMaxDiscountOwners;

public class Task14Test {

    private static final List<Supplier> firstList = List.of(
            new Supplier(1, 1993, "Sumskaya"),
            new Supplier(2, 1994, "Pushkinska,ya"),
            new Supplier(3, 1995, "Beketova"),
            new Supplier(4, 1996, "Amosova"),
            new Supplier(5, 1996, "Amosova")
    );

    private static final List<SupplierDiscount> secondList = List.of(
            new SupplierDiscount(1, 9, "Posad"),
            new SupplierDiscount(2, 9, "Posad"),
            new SupplierDiscount(3, 10, "Colins"),
            new SupplierDiscount(4, 10, "Colins"),
            new SupplierDiscount(5, 10, "Denim")
    );

    private static final List<ShopWithMaxDiscountOwner> thirdList = List.of(
            new ShopWithMaxDiscountOwner("Colins", new Supplier(3, 1995, "Beketova")),
            new ShopWithMaxDiscountOwner("Denim", new Supplier(5, 1996, "Amosova")),
            new ShopWithMaxDiscountOwner("Posad", new Supplier(1, 1993, "Sumskaya"))
    );

    @Test
    public void testGetShopsWithMaxDiscountOwners() {
        Assert.assertEquals(getShopsWithMaxDiscountOwners(firstList, secondList), thirdList);
    }
}
