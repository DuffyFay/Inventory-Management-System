package com.finalproject.InventoryManagementSystem.service;

import com.finalproject.InventoryManagementSystem.domain.Product;

public class ProductService {

    private Product[] products; //store Product object
    private int productNum = 1;//record how many houses currently
    private int idCounter = 1;
    public ProductService(int size) {
        // new product
        products = new Product[size];//when ProductService is created, set size for it
        products[0] = new Product(1, "S20",200, "phone");
    }

    //find by id method, return product or null
    public Product findById(int findId) {
        for(int i = 0; i < productNum; i++) {
            if(findId == products[i].getId()) {
                return products[i];
            }
        }
        return null;
    }

    //del method, delete product information
    public boolean del(int delId) {
        //To begin
        //Locate the subscript corresponding to the product information you wish to remove
        //Subscript and product id are not the same
        int index = -1;
        for (int i = 0 ; i < productNum; i++) {
            if(delId == products[i].getId()){
                //The element with the subscript[i] represents the id of the product to be deleted
                index = i;//use index record i
            }
        }
        if(index == -1) {
            //delete id does not exist in array
            return false;
        }
        // if delete id found
        for(int i= index; i < productNum - 1; i++) {
            products[i] = products[i+1];
        }
        products[--productNum] = null;//Set the last existing product information to null.
        return true;
    }

    //add method, add new object, return boolean
    public boolean add(Product newProduct) {
        //consider capacity
        if (productNum >= products.length) {
            //reach to the capacity
            System.out.println("Stock is full, can not add new product");
            return false;
        }
        //newProduct object add to the end of products[]
        products[productNum] = newProduct;
        productNum++;
        idCounter++;//id++ mechanism
        newProduct.setId(idCounter);
        return true;
    }

    //list method, return products
    public Product[] list() {
        return products;
    }
}
