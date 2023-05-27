package com.finalproject.InventoryManagementSystem.domain;

public class TV extends Product{
    private String make;
    private int screenSize;
    private String type;
    private String capable3d;

    public TV(int id, String name, int price, String description,
              String make, int screenSize, String type, String capable3d) {
        super(id, name, price, description);
        this.make = make;
        this.screenSize = screenSize;
        this.type = type;
        this.capable3d = capable3d;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCapable3d() {
        return capable3d;
    }

    public void setCapable3d(String capable3d) {
        this.capable3d = capable3d;
    }

    @Override
    public String toString() {
        return make + "\t\t\t" +
               screenSize + "\t\t\t" +
               type + "\t\t\t" +
               capable3d;
    }
}
