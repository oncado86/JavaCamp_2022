package Homeworks.Homework_2.h05_interfaces_polymorphism.dataAccess;

public class MySqlCustomerDal implements ICustomerDal, IRepository {

    @Override
    public void add() {
        System.out.println("My SQL'e eklendi.");
    }
    
}
