package dataAccess;

import entities.Product;

public class HibernateProductDao implements ProductDao {
    public void add(Product product) {
        // ! Sadece ve sadece SQL kodları buraya yazılır.
        System.out.println("Hibernate ile veri tabanına eklendi.");
    }
}
