package Homeworks.h01_OOP.business;

import Homeworks.h01_OOP.dataAccess.ICustomerDAL;
import Homeworks.h01_OOP.entities.IEntitie;

public class CustomerManager {
    private ICustomerDAL customerDAL;
    // private Customer customer;

    public CustomerManager(ICustomerDAL customerDAL) {
        this.customerDAL = customerDAL;
    }

    public void add(IEntitie entitie) {
        customerDAL.add(entitie);
    }

    public void delete(IEntitie entitie) {
        customerDAL.delete(entitie);
    }
}
