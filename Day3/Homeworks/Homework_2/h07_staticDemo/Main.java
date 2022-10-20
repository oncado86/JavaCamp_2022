package Homeworks.Homework_2.h07_staticDemo;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product(1, "Mouse", 10);
        ProductManager pManager = new ProductManager();
        pManager.add(product1);
    }

    // DatabaseHelper.Connection.createConnection();
}
