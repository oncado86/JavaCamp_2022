import business.ProductManager;
import dataAccess.HibernateProductDao;
import dataAccess.JdbcProductDao;
import entities.Product;

public class Main {
    public static void main(String[] args) throws Exception {
        Product product = new Product(1, "iPhone XR", 10000);
        ProductManager productManager = new ProductManager(new JdbcProductDao());
        productManager.add(product);
    }
}
