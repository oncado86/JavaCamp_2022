package Homeworks.Homework_2.h05_interfaces_polymorphism.dataAccess;

public class SqlServerCustomerDal implements ICustomerDal{

    @Override
    public void add() {
        System.out.println("SQL Server'e eklendi.");
        
    }
    
}
