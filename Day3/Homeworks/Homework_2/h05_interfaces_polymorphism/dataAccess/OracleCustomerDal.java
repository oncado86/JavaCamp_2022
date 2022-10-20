package Homeworks.Homework_2.h05_interfaces_polymorphism.dataAccess;

public class OracleCustomerDal implements ICustomerDal{

    @Override
    public void add() {
        System.out.println("Oracle'e eklendi.");
    }
    
}
