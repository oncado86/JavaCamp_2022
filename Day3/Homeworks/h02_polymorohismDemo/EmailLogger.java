package Homeworks.h02_polymorohismDemo;

public class EmailLogger extends BaseLogger {
    @Override
    public void log(String message) {
        System.out.println(String.format("Logged to e-mail : %s", message));
    }
}
