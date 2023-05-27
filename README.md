# Inventory Management System

The Inventory Management System is a console-based Java application that allows users to manage inventory items and customer orders. This robust system demonstrates solid principles of Object-Oriented Programming (OOP) and leverages built-in Java libraries to effectively handle input/output operations.

## Features

- Add or remove products.
- Search for a product using its product ID.
- Display a list of all products.
- Create new customers and search for existing customers.
- Manage customer orders, including adding and updating orders.

## Setup and Installation

1. Clone the repository or download the source code.
2. Open the project in your preferred Java IDE.
3. Ensure you have the Java Development Kit (JDK) installed to run the program.

## Usage

The program can be started from the Main.java class. The user interface is console-based and menu-driven for easy navigation. Select the desired action from the main menu and follow the prompts.

## Code Structure

This project follows the OOP design principles and uses the following classes:

- `Product`: Handles product details including ID, name, price, and description.
- `Phone` & `Tv`: Specific product classes that inherit from the `Product` class.
- `Customer`: Manages customer details including ID, name, phone, address, and order details.
- `Order` & `OrderDetails`: Manage order details.
- `ProductDB`: Simulates a product database and includes methods for product management.
- `ProductView`: Contains the main user interface and program flow, including calling the relevant service methods.

All classes make use of encapsulation, with private class variables and public getters and setters. Inheritance is demonstrated in the `Phone` and `Tv` classes, and polymorphism is demonstrated in the methods within the service classes.

## Future Enhancements

- Implement a real database solution to replace the `ProductDB` class.
- Extend the program to handle more product types beyond `Phone` and `Tv`.
- Improve the user interface by migrating from a console-based application to a web or desktop GUI.

## Author

- Ming Zhong
