package Education.oopWithNLayeredApp;

import java.util.ArrayList;
import java.util.List;

import Education.oopWithNLayeredApp.business.ProductManager;
import Education.oopWithNLayeredApp.core.logging.DataBaseLogger;
import Education.oopWithNLayeredApp.core.logging.FileLogger;
import Education.oopWithNLayeredApp.core.logging.Logger;
import Education.oopWithNLayeredApp.core.logging.MailLogger;
import Education.oopWithNLayeredApp.dataAccess.JdbcProductDao;
import Education.oopWithNLayeredApp.entities.Product;



/**
 * @version 1.0
 * @author <a href="https://github.com/oncado86">OnCaDo</a>
 * @see * JAVA Yazılım Geliştirici Kampı 2022
 * @category JAVA
 * 
 ** @apiNote Çok katmanlı mimaride Java projesi.
 */

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
