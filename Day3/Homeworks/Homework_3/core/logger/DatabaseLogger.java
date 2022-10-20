package Homeworks.Homework_3.core.logger;

public class DatabaseLogger implements ILoggerBase {

    @Override
    public void log(String message) {
        System.out.println(String.format("Logged to database: %s", message));
    }
    
}
