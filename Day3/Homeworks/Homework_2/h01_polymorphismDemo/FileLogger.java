package Homeworks.h02_polymorphismDemo;

public class FileLogger extends BaseLogger {
    @Override
    public void log(String message) {
        System.out.println(String.format("Logged to file : %s", message));
    }
}
