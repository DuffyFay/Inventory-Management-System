package com.finalproject.InventoryManagementSystem.domain;

import java.util.ArrayList;
import java.util.List;

public class Order {
    public int quantity;

    public Order() {
        int quantity = 0;
    }

    public Order(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Order{" +
                "quantity=" + quantity +
                '}';
    }
}




