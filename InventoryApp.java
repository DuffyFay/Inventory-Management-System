package com.finalproject.InventoryManagementSystem;

import com.finalproject.InventoryManagementSystem.view.ProductView;

public class InventoryApp {
    public static void main(String[] args) {
        //In here, I can:
        //create ProductView Object
        //display main menu
        //entrance of the whole system
        new ProductView().mainMenu();
        System.out.println("You quit Inventory Management System");
    }
}
