package com.finalproject.InventoryManagementSystem.view;

import com.finalproject.InventoryManagementSystem.domain.Customer;
import com.finalproject.InventoryManagementSystem.domain.Product;
import com.finalproject.InventoryManagementSystem.service.CustomerService;
import com.finalproject.InventoryManagementSystem.service.ProductService;
import com.finalproject.InventoryManagementSystem.utils.Utility;

import java.sql.SQLOutput;

/**
 * 1. Create a new product
 *
 * 2. Search for a product by productid
 *
 * 3. Display all products
 *
 * 4. Delete products
 *
 * 5. Create a new customer
 *
 * 6. Search customer and order
 *
 * 7. Order Products
 *
 * 8. Display all customers
 *
 * 9. Quit
 *
 * Name: Ming Zhong
 * ID: R00240259
 */

public class ProductView {

    private boolean loop = true; //control main menu
    private char key = ' '; // read user input

    private ProductService productService = new ProductService(20);//cap Product at 20
    private CustomerService customerService = new CustomerService(10);//cap Customer at 10

    //according to ID, change information of customer
    public void update() {
        System.out.println("=====Change customer order=====");
        System.out.println("Please enter customer id to order (enter -1 Back to main manu)");
        int updateId = Utility.readInt();
        if(updateId == -1) {
            System.out.println("=====Back to main manu=====");
            return;
        }

        //according to updateId, look up object
        Customer customer = customerService.findByCustomerId(updateId);
        if (customer == null) {
            System.out.println("=====Customer does not exist=====");
            return;
        }

        System.out.print("Enter product you want to order: " + customer.getOrderProduct());
        //if user hit enter,  user does not want to change anything
        String product = Utility.readString(10, "");
        if(!"".equals(product)) { //change
            customer.setOrderProduct(product);
        }

        System.out.print("Quantity: " + customer.getOrderQuantity());
        //if user hit enter,  user does not want to change anything
        int quantity = Utility.readInt(-1);
        if(quantity != -1) { //change
            customer.setOrderQuantity(quantity);
        }

        System.out.println("=======Success=======");
    }

    //use the product id to find a product
    public void findProduct() {
        System.out.println("=======Search a product=======");
        System.out.print("Enter id: ");
        int findId = Utility.readInt();
        Product product = productService.findById(findId);
        if (product != null) {
            System.out.println(product);
        }else {
            System.out.println("=====id does not exist=====");
        }
    }

    //create order product
    public void findCustomer() {
        System.out.println("=======Search a customer=======");
        System.out.println("Enter customer's id: ");
        int findByCustomerId = Utility.readInt();
        Customer customer = customerService.findByCustomerId(findByCustomerId);
        if(customer != null) {
            System.out.println(customer);
        }else {
            System.out.println("=====id does not exist=====");
        }
    }



    public void exit() {
        //confirm if user want to quit the programme
        char c = Utility.readConfirmSelection();
        if(c == 'Y') {
            loop = false;
        }
    }


    //delProduct() read user input id, service del method
    public void delProduct() {
        System.out.println("=======Delete a product=======");
        System.out.print("Enter the product id you want to delete(enter -1 to exit): ");
        int delId = Utility.readInt();
        if(delId == -1) {
            System.out.println("=======You exit Delete=======");
            return;
        }
        //readConfirmSelection() method has a loop, it will not exit unless user enter Y/N
        char choice = Utility.readConfirmSelection();
        if ( choice =='Y') {
            //user confirm delete
            if(productService.del(delId)) {
                System.out.println("=======Delete Success=======");
            } else {
                System.out.println("========id not exist========");
                System.out.println("========Delete Failed========");
            }
        } else {
        System.out.println("=======You exit Delete=======");
        }
    }

    // addProduct() create product, use add method
    public void addProduct() {
        System.out.println("=======Create a new product=======");
        System.out.println("name: ");
        String name = Utility.readString(10);
        System.out.println("price: ");
        int price = Utility.readInt();
        System.out.println("description: ");
        String description = Utility.readString(10);
        //create new product object, id is distributed by system
        //users cannot change id
        Product newProduct = new Product(0, name, price, description);
        if(productService.add(newProduct)) {
            System.out.println("====Successfully add new product====");
        } else {
            System.out.println("====Fail add new product====");
        }
    }

    // addCustomer(), create customer object
    public void addCustomer() {
        System.out.println("=======Create new customer=======");
        System.out.println("name: ");
        String name = Utility.readString(20);
        System.out.print("Phone: ");
        String phone = Utility.readString(14);
        System.out.print("Address: ");
        String address = Utility.readString(40);
        System.out.print("Product you want to order: ");
        String orderProduct = Utility.readString(20);
        System.out.print("Quantity: ");
        int orderQuantity = Utility.readInt();
        //create a customer
        Customer newCustomer = new Customer(2000, name, phone, address,orderProduct,orderQuantity);
        if(customerService.add(newCustomer)) {
            System.out.println("=====Create customer succeed=====");
        } else {
            System.out.println("=====Create customer failed=====");
        }
    }
    // listProducts() display all products
    public void listProducts() {
        System.out.println("=======Display all products=======");
        System.out.println("id\t\tname\t\tprice\t\tdescription");
        Product[] products = productService.list();//show all product information
        for (int i = 0; i < products.length; i++) {//null
            if (products[i] ==null) {
                break;
            }
            System.out.println(products[i]);
        }
        System.out.println("======All products displayed======\n\n\n");

    }

    // listCustomer() show customer information
    public void listCustomer() {
        System.out.println("=======Display all customers=======");
        System.out.println("id\t\tname\t\tPhone\t\taddress\t\torder\t\tquantity");
        Customer[] customers = customerService.list(); //get all customer information
        for (int i = 0; i < customers.length; i++) {
            if (customers[i] ==null) {
                break;
            }
            System.out.println(customers[i]);
        }
        System.out.println("=======All customers displayed=======");
    }

    // 1. Create a new product
        public void mainMenu() {
            do{
                System.out.println("====Inventory Management System====");
                System.out.println("=============Main Menu=============");
                System.out.println("\t1 Create a new product");
                System.out.println("\t2 Search for a product by id");
                System.out.println("\t3 Display all products");
                System.out.println("\t4 Delete products");
                System.out.println("\t5 Create a new customer");
                System.out.println("\t6 Search customer and order");
                System.out.println("\t7 Order Products");
                System.out.println("\t8 Display all customers");
                System.out.println("\t9 Quit");
                System.out.println("========Please Select (1-9)========");
                key = Utility.readChar();
                switch (key) {
                    case '1':
                        //System.out.println("Create product");
                        addProduct();
                        break;
                    case '2':
                        //System.out.println("Search");
                        findProduct();
                        break;
                    case '3':
                        //System.out.println("Display product");
                        listProducts();
                        break;
                    case '4':
                        //System.out.println("Delete product");
                        delProduct();
                        break;
                    case '5':
                        //System.out.println("Create a new customer");
                        addCustomer();
                        listCustomer();
                        break;
                    case '6' :
                        System.out.println("find customer");
                        findCustomer();
                        break;
                    case '7':
                        System.out.println("1 Order product for new customer");
                        System.out.println("2 Order product for existing customer");
                        System.out.println("3 Back to main manu");
                        switch (Utility.readChar()) {
                            case '1' :
                                addCustomer();
                                System.out.println("Your customer is on the list");
                                listCustomer();
                                break;
                            case '2' :
                                listCustomer();
                                update();
                                listCustomer();
                                break;
                            case '3' :
                                System.out.println("exit");
                                break;
                        }
                        break;

                    case '8':
                        //System.out.println("Display all customers");
                        listCustomer();
                        break;

                    case '9':
                        //System.out.println("Quit");
                        exit();
                        break;


                }
            }while (loop);
        }
}
