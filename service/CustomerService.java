package com.finalproject.InventoryManagementSystem.service;


import com.finalproject.InventoryManagementSystem.domain.Customer;

public class CustomerService {
    private Customer[] customers; //record customer object
    private int customerNums = 3; // record how many customers we have now
    private  int orderNumCounter = 2003;//record orderNum++

    public CustomerService(int size) {
        //new customer
        customers = new Customer[size];//construct
        // testing customer, will be replaced when user enter new customer to the list
        customers[0] = new Customer(2001, "Kuma", "08711111", "Dublin", " ", 0);
        customers[1] = new Customer(2002, "Popo", "08512346", "Cork", " ", 0);
        customers[2] = new Customer(2003, "Jowl", "08312347", "Galway", " ", 0);
    }

    public Customer findByCustomerId(int findId) {
        for (int i = 0; i < customerNums; i++) {
            if(findId == customers[i].getOrderNum()) {
                return customers[i];
            }
        }
        return null;
    }

    public boolean add(Customer newCustomer) {
        //consider if it is able to add new customer
        if(customerNums == customers.length){
            System.out.println("We have too much customers to serve, can not add more customers");
            return false;
        }
        //new customer add into array
        customers[customerNums++] = newCustomer;
        // orderNum increment
        newCustomer.setOrderNum(++orderNumCounter);
        return true;
    }

    // list method return customers
    public Customer[] list() {
        return customers;
    }
}
