package Education.oopWithNLayeredApp.dataAccess;

import Education.oopWithNLayeredApp.entities.Product;

public class JdbcProductDao implements ProductDao {
    public void add(Product product) {
        // ! Sadece ve sadece SQL kodları buraya yazılır.
        System.out.println("JDBC ile veri tabanına eklendi.");
    }

}
