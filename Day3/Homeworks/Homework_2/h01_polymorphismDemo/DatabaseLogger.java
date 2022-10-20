package Homeworks.Homework_2.h01_polymorphismDemo;

public class DatabaseLogger extends BaseLogger {
    @Override
    public void log(String message) {
        System.out.println(String.format("Logged to database : %s", message));
    }
}
