package Homeworks.Homework_2.h04_abstractDemo;

public class SqlServerDatabaseManager extends BaseDatabaseManager{

    @Override
    public void getData() {
        System.out.println("Veriler getirildi : SQL Server");
    }
    
}
