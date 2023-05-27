package com.finalproject.InventoryManagementSystem.domain;

/**
 * Object customer represent customer information
 *
 *  Name: Ming Zhong
 *  ID: R00240259
 *
 */


public class Customer {
    //order number, name, address, orderProduct, orderQuantity
    private int orderNum;
    private String orderName;

    private String orderPhone;
    private String address;
    private String orderProduct;

    private int orderQuantity;

    //constructor

    public Customer(int orderNum, String orderName, String orderPhone, String address,
                    String orderProduct, int orderQuantity) {
        this.orderNum = orderNum;
        this.orderName = orderName;
        this.orderPhone = orderPhone;
        this.address = address;
        this.orderProduct = orderProduct;
        this.orderQuantity = orderQuantity;
    }

    //getter, setter


    public int getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(int orderNum) {
        this.orderNum = orderNum;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public String getOrderPhone() {
        return orderPhone;
    }

    public void setOrderPhone(String orderPhone) {
        this.orderPhone = orderPhone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getOrderProduct() {
        return orderProduct;
    }

    public void setOrderProduct(String orderProduct) {
        this.orderProduct = orderProduct;
    }

    public int getOrderQuantity() {
        return orderQuantity;
    }

    public void setOrderQuantity(int orderQuantity) {
        this.orderQuantity = orderQuantity;
    }

    @Override
    public String toString() {
        return orderNum +
                "\t" + orderName +
                "\t\t" + orderPhone +
                "\t\t" + address +
                "\t\t" + orderProduct +
                "\t\t" + orderQuantity;
    }
}
