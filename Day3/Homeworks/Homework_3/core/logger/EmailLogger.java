package Homeworks.Homework_3.core.logger;

public class EmailLogger implements ILoggerBase {

    @Override
    public void log(String message) {
        System.out.println(String.format("Logged to email: %s", message));
    }
    
}
