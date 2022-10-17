package Education.oopWithNLayeredApp.dataAccess;

import Education.oopWithNLayeredApp.entities.Product;

public class HibernateProductDao implements ProductDao {
    @Override
    public void add(Product product) {
        // ! Sadece ve sadece SQL kodları buraya yazılır.
        System.out.println("Hibernate ile veri tabanına eklendi.");
    
    }
}
