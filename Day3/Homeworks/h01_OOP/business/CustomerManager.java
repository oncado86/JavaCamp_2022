package Homeworks.h01_OOP.business;

import Homeworks.h01_OOP.dataAccess.ICustomerDAL;
import Homeworks.h01_OOP.entities.IEntitie;

public class CustomerManager {
    private ICustomerDAL customerDAL;
    private ICreditManager creditManager;
    // private Customer customer;

    public CustomerManager(ICustomerDAL customerDAL, ICreditManager creditManager) {
        this.customerDAL = customerDAL;
        this.creditManager = creditManager;
    }

    public void add(IEntitie entitie) {
        customerDAL.add(entitie);
    }

    public void delete(IEntitie entitie) {
        customerDAL.delete(entitie);
    }

    public void GiveCredit() {
        creditManager.calculate();
        System.out.println("Kredi Verildi.");
        creditManager.save();
    }
}
