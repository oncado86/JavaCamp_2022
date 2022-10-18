package Homeworks.h02_polymorphismDemo;

public class DatabaseLogger extends BaseLogger {
    @Override
    public void log(String message) {
        System.out.println(String.format("Logged to database : %s", message));
    }
}
