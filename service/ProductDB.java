package com.finalproject.InventoryManagementSystem.service;

import java.util.ArrayList;
import java.util.List;

public class ProductDB {
    public int id;
    public String name;
    List<String> product;

    public ProductDB() {
        name = "Uninitialized";
        id = 0;
        product = new ArrayList<String>();
    }

    public ProductDB(int id, String name, List<String> product) {
        this.id = id;
        this.name = name;
        this.product = product;
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

    public List<String> getProduct() {
        return product;
    }

    public void setProduct(List<String> product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "ProductDB{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", product=" + product +
                '}';
    }


}
