package Homeworks.h06_interfaces_polymorphism.dataAccess;

public class MySqlCustomerDal implements ICustomerDal, IRepository {

    @Override
    public void add() {
        System.out.println("My SQL'e eklendi.");
    }
    
}
