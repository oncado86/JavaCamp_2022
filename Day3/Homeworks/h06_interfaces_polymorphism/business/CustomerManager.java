package Homeworks.h06_interfaces_polymorphism.business;

import Homeworks.h06_interfaces_polymorphism.dataAccess.ICustomerDal;

public class CustomerManager {
    public ICustomerDal customerDal;

    public CustomerManager() {
    }

    public CustomerManager(ICustomerDal customerDal) {
        this.customerDal = customerDal;
    }

    public void add() {
        customerDal.add();
    }
}
