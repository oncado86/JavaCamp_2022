package Calismalar.C_06_ClassesWithAttributes_GetterSetter_Constructor;

/**
 * @version 1.0
 * @author <a href="https://github.com/oncado86">OnCaDo</a>
 * @category JAVA
 * @see * JAVA Yazılım Geliştirici Kampı 2022
 * 
 * @apiNote
 **          Attributes(Özellikler) ile çalışmak
 */
public class Main {
    public static void main(String[] args) {
        Product product = new Product();
        ProductManager productManager = new ProductManager();
        product.setId(1);
        product.setName("Laptop");
        product.setDescription("Monster");
        product.setPrice(13500);
        product.setStockAmount(5);

        productManager.Add(product);
        System.out.println(String.format("Product CODE: %s", product.getCode()));

        Product product2 = new Product(1, "Mobile Phone", "iPhone", 45000, 15, "Silver");
        productManager.Add(product2);
        System.out.println(String.format("Product Name: %s", product2.getName()));
    }

}
