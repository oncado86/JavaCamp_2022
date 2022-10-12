import java.util.ArrayList;
import java.util.List;

import business.ProductManager;
import core.logging.DataBaseLogger;
import core.logging.FileLogger;
import core.logging.Logger;
import core.logging.MailLogger;
import dataAccess.JdbcProductDao;
import entities.Product;

public class Main {
    public static void main(String[] args) throws Exception {
        List<Logger> loggers = new ArrayList<>();
        loggers.add(new DataBaseLogger());
        loggers.add(new FileLogger());
        loggers.add(new MailLogger());
        ProductManager productManager = new ProductManager(new JdbcProductDao(), loggers);
        Product product = new Product(1, "iPhone XR", 10000);
        productManager.add(product);
    }
}
