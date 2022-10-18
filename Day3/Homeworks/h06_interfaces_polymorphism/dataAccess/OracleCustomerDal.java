package Homeworks.h06_interfaces_polymorphism.dataAccess;

public class OracleCustomerDal implements ICustomerDal{

    @Override
    public void add() {
        System.out.println("Oracle'e eklendi.");
    }
    
}
