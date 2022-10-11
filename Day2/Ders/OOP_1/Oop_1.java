package Ders.OOP_1;

import java.util.ArrayList;

public class Oop_1 {
    /**
     * @author <a href="https://github.com/oncado86">OnCaDo</a>
     * @deprecated JAVA Yazılım Geliştirici Kampı 2022
     * @version 1.0
     * 
     **          OOP : Object-Oriented Programming
     **          (NYP: Nesne Yönelimli Programlama)
     */
    public static void main(String[] args) {
        // String mesaj = "OnCaDo";

        Product product1 = new Product();

        product1.setName("Delonghi Kahve Makinesi");
        product1.setUnitPrice(7500);
        product1.setDiscount(7);
        product1.setUnitsInStock(3);
        product1.setImageUrl("image1.jpg");

        Product product2 = new Product();
        product2.setName("Smeg Kahve Makinesi");
        product2.setUnitPrice(6500);
        product2.setDiscount(8);
        product2.setUnitsInStock(2);
        product2.setImageUrl("image2.jpg");

        Product product3 = new Product();
        product3.setName("Kitchen Aid Kahve Makinesi");
        product3.setUnitPrice(4500);
        product3.setDiscount(9);
        product3.setUnitsInStock(4);
        product3.setImageUrl("image3.jpg");

        Product[] products = { product1, product2, product3 };

        ArrayList<Product> aProducts = new ArrayList<Product>();
        aProducts.add(product1);
        aProducts.add(product2);
        aProducts.add(product3);

        System.out.println("<ul>");
        for (Product product : products) {
            System.out.println("<li>" + product.getName() + "</li>");
        }
        System.out.println("</ul>");

        for (Product aProduct : aProducts) {
            System.out.println(aProduct.getName());
        }

    }
}
