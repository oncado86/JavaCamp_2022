package Homeworks.Homework_2.h07_staticDemo;

public class ProductManager {
    public void add(Product product) {
        if(ProductValidator.isValid(product))
            System.out.println(String.format("Product: '%s' added successfully", product.getName()));
        else
            System.out.println(String.format("Product: '%s' adding failed, information is invalid.", product.getName()));
    }
}
