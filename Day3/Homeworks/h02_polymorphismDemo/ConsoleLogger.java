package Homeworks.h02_polymorphismDemo;

public class ConsoleLogger extends BaseLogger {
    @Override
    public void log(String message) {
        System.out.println(String.format("Logged to console : %s", message));
    }
}
