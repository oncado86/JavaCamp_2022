package Homeworks.Homework_2.h04_abstractDemo;

public class CustomerManager {
    BaseDatabaseManager databaseManager;

    public CustomerManager(BaseDatabaseManager databaseManager) {
        this.databaseManager = databaseManager;
    }

    public CustomerManager() {
    }

    public void getCustomers() {
        databaseManager.getData();
    }
}
