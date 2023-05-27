package com.finalproject.InventoryManagementSystem.domain;

/**
* Object product represent product information
*/

public class Product {
    //id    name    price   description
    private int id;
    private String name;
    private int price;
    private String description;

    public Product(int id, String name, int price, String description) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return  id +
                "\t\t" + name +
                "\t\t\t" + price +
                "\t\t\t" + description;
    }
}
