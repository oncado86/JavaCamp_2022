package Homeworks.h01_OOP.dataAccess;

import Homeworks.h01_OOP.entities.IEntitie;

public class JdbcCustomerDataAccess implements ICustomerDAL {

    @Override
    public void add(IEntitie customer) {
        System.out.println("JDBC veri tabanına eklendi: " + customer.getName());
    }

    @Override
    public void delete(IEntitie customer) {
        System.out.println("JDBC veri tabanından silindi " + customer.getName());
    }

}
