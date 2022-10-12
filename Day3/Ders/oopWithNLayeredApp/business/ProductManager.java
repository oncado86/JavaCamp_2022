package business;

import dataAccess.ProductDao;
import entities.Product;

public class ProductManager {
    private ProductDao productDao;

    public ProductManager(ProductDao productDao) {
        this.productDao = productDao;
    }

    public void add(Product product) throws Exception {
        // ! Sadece iş kuralları yazılır.!
        if (product.getUnitPrice() < 10) {
            throw new Exception("Ürün fiyatın 10₺'den az olamaz.");
        }
        productDao.add(product);
    }
}
