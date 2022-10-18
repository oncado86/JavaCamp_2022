package Homeworks.h02_polymorphismDemo;

public class BaseLogger {
    public void log(String message) {
        System.out.println(String.format("Default logger: %s", message));
    }
}
