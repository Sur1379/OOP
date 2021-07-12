package com.company.vending.model;

public class Product {
    private static int reminderCount = 10;

    public static int getReminderCount() {
        return reminderCount;
    }

    public static void setReminderCount(int reminderCount) {
        Product.reminderCount = reminderCount;
    }
}