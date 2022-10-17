package Education.oopWithNLayeredApp.business;

import java.util.List;

import Education.oopWithNLayeredApp.core.logging.Logger;
import Education.oopWithNLayeredApp.dataAccess.ProductDao;
import Education.oopWithNLayeredApp.entities.Product;



public class ProductManager {
    private ProductDao productDao;
    private List<Logger> loggers;

    public ProductManager(ProductDao productDao, List<Logger> loggers) {
        this.productDao = productDao;
        this.loggers = loggers;
    }

    public void add(Product product) throws Exception {
        // ! Sadece iş kuralları yazılır.!
        if (product.getUnitPrice() < 10) {
            throw new Exception("Ürün fiyatın 10₺'den az olamaz.");
        }
        productDao.add(product);
        for (Logger logger : loggers) {
            logger.log(product.getName());
        }
    }
}
