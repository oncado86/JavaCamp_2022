package Homeworks.Homework_2.h04_abstractDemo;

public class Main {
    public static void main(String[] args) {
        CustomerManager customerManager1 = new CustomerManager();
        customerManager1.databaseManager = new OracleDatabaseManager();
        customerManager1.getCustomers();

        CustomerManager customerManager2 = new CustomerManager(new SqlServerDatabaseManager());
        customerManager2.getCustomers();
    }
}
