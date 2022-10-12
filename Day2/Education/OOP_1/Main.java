package Education.OOP_1;

import java.util.ArrayList;

/**
 * @version 1.0
 * @author <a href="https://github.com/oncado86">OnCaDo</a>
 * @category JAVA
 * @see * JAVA Yazılım Geliştirici Kampı 2022
 * 
 * @apiNote
 **          OOP : Object-Oriented Programming
 * @apiNote
 **          (NYP: Nesne Yönelimli Programlama)
 */
public class Main {

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

        IndividuolCustomer individuolCustomer = new IndividuolCustomer();
        individuolCustomer.setId(1);
        individuolCustomer.setCustomerNumber("12345");
        individuolCustomer.setPhoneNumber("05xxxxxxxxx");
        individuolCustomer.setFirstName("OnCaDo");
        individuolCustomer.setLastName("OnCaDo");

        CorporateCustomer corporateCustomer = new CorporateCustomer();
        corporateCustomer.setId(2);
        corporateCustomer.setCompanyName("github.com/oncado86");
        corporateCustomer.setPhoneNumber("05xxxxxxxxx");
        corporateCustomer.setTaxNumber("1234567890");
        corporateCustomer.setCustomerNumber("54321");

        // Customer[] customers = { individuolCustomer, corporateCustomer };

        ArrayList<Customer> aCustomers = new ArrayList<Customer>();
        aCustomers.add(individuolCustomer);
        aCustomers.add(corporateCustomer);
    }
}
