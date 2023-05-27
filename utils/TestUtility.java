package com.finalproject.InventoryManagementSystem.utils;

public class TestUtility {
    public static void main(String[] args) {

        //This is a test class
        //require enter a String with limit of 3 characters
        System.out.println("Enter String with max 3 characters");
        String s = Utility.readString(3);
        System.out.println("S= " + s);

        //require enter a String with limit of 10 characters
        // if not enter anything and hit enter, return default value ming
        String s2 = Utility.readString(10, "default");
        System.out.println("s2= " + s2);
    }
}
