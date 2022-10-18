package Homeworks.h01_OOP;

import Homeworks.h01_OOP.business.CarCreditManager;
import Homeworks.h01_OOP.business.CustomerManager;
import Homeworks.h01_OOP.dataAccess.JdbcCustomerDataAccess;
import Homeworks.h01_OOP.entities.Company;
import Homeworks.h01_OOP.entities.Customer;
import Homeworks.h01_OOP.entities.Person;

public class Main {
    public static void main(String[] args) {
        CustomerManager cm = new CustomerManager(new JdbcCustomerDataAccess(), new CarCreditManager());

        Customer c1 = new Person(0, "OnCaDo", "OnCaDo", "Ankara", "1234567890");
        cm.add(c1);

        Customer c2 = new Company(1, "OnCaDo", "Ankara", "112233");
        cm.add(c2);

        cm.delete(c1);
        cm.GiveCredit();
    }
}
