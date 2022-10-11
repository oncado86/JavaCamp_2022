package Ders.OOP_1;

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
        Product product = new Product();
        product.name = "Kahve Makinesi";
        product.unitPrice = 15;

        System.out.println(product.name);
    }
        
}
