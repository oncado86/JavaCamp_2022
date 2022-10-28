package Homeworks.Homework_1.h01_OOP.business;

import Homeworks.Homework_1.h01_OOP.dataAccess.ICustomerDAL;
import Homeworks.Homework_1.h01_OOP.entities.IEntitie;

public class CustomerManager {
    private ICustomerDAL customerDAL;
    private ICreditManager creditManager;

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
