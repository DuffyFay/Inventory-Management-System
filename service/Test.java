package com.finalproject.InventoryManagementSystem.service;

import com.finalproject.InventoryManagementSystem.domain.Customer;
import com.finalproject.InventoryManagementSystem.domain.Order;
import com.finalproject.InventoryManagementSystem.domain.Phone;
import com.finalproject.InventoryManagementSystem.domain.TV;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Phone p = new Phone(1, "iPhone", 100, "Phone",
                "Apple", "iPhone6", 12);
        Phone p1 = new Phone(2, "Xiaomi", 100, "Phone",
                "xiaomi", "Mi6\t", 12);
        Phone p2 = new Phone(3, "Samsung", 100, "Phone",
                "Samsung", "S20\t", 12);
        Phone p3 = new Phone(4, "Huawei", 100, "Phone",
                "Huawei", "Honor", 12);
        List database = new ArrayList();
        database.add(p);
        database.add(p1);
        database.add(p2);
        database.add(p3);
        System.out.println("====Phone Information====");
        System.out.println("make\t\t\tmodel\t\tstorage(gb)");
        for (int i = 0; i < database.size(); i++) {
            Phone phone = (Phone) database.get(i);
            System.out.println(phone);
        }
        System.out.println("====End of information====");



        TV t = new TV(1, "Sa2300",100, "TV","Samsung",32,"oLED","no");
        TV t1 = new TV(2, "So4200",100, "TV","Sony",42,"oLED","no");
        TV t2 = new TV(3, "Lg5200",100, "TV","Lg\t",52,"oLED","no");
        TV t3 = new TV(4, "Hi7200",100, "TV","Hisense",72,"oLED","yes");
        List tvData = new ArrayList();
        tvData.add(t);
        tvData.add(t1);
        tvData.add(t2);
        tvData.add(t3);
        System.out.println("====TV Information====");
        System.out.println("makes\t\tscreen size\t\ttype\t\t3d capable");
        for (int i = 0; i < tvData.size(); i++) {
            TV tv = (TV) tvData.get(i);
            System.out.println(tv);
        }
        System.out.println("====End of information====");



        Customer mary = new Customer(1, "\tMary",
                "iPhone", "Cork", "apple\t",
                1);
        Customer john = new Customer(2, "\tJohn",
                "iPhone", "Cork", "apple\t",
                1);
        Customer alex = new Customer(3, "\talex",
                "iPhone", "Cork", "apple\t",
                1);
        Customer ming = new Customer(4, "\tming",
                "iPhone", "Cork", "apple\t",
                1);

        List order = new ArrayList();
        order.add(mary);
        order.add(john);
        order.add(alex);
        order.add(ming);

        System.out.println("====Order Information====");
        System.out.println("id\t\tname\t\tproduct\t\taddress\t\tmake\t\tquantity");

        for (int i = 0; i < order.size(); i++) {
            Customer customer = (Customer) order.get(i);
            System.out.println(customer);
        }
        System.out.println("====End of information====");

    }
}