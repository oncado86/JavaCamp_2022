package Homeworks.h06_interfaces_polymorphism;

import Homeworks.h06_interfaces_polymorphism.business.CustomerManager;
import Homeworks.h06_interfaces_polymorphism.dataAccess.MySqlCustomerDal;
import Homeworks.h06_interfaces_polymorphism.dataAccess.OracleCustomerDal;
import Homeworks.h06_interfaces_polymorphism.dataAccess.SqlServerCustomerDal;

public class Main {
    public static void main(String[] args) {
        CustomerManager customerManager1 = new CustomerManager();
        customerManager1.customerDal = new OracleCustomerDal();
        customerManager1.add();

        CustomerManager customerManager2 = new CustomerManager(new MySqlCustomerDal());
        customerManager2.add();

        CustomerManager customerManager3 = new CustomerManager(new SqlServerCustomerDal());
        customerManager3.add();
    }
}
