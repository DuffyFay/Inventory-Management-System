package com.finalproject.InventoryManagementSystem.domain;

public class Phone extends Product{
    private String make;
    private String model;
    private int storageSpace;

    public Phone(int id, String name, int price, String description,
                 String make, String model, int storageSpace) {
        super(id, name, price, description);
        this.make = make;
        this.model = model;
        this.storageSpace = storageSpace;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getStorageSpace() {
        return storageSpace;
    }

    public void setStorageSpace(int storageSpace) {
        this.storageSpace = storageSpace;
    }

    @Override
    public String toString() {
        return make + "\t\t\t" +
               model + "\t\t\t" +
               storageSpace;
    }
}
