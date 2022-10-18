package Homeworks.h02_polymorohismDemo;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // List<BaseLogger> loggers = Arrays.asList(
        //         new FileLogger(),
        //         new EmailLogger(),
        //         new DatabaseLogger(),
        //         new ConsoleLogger());

        // for (BaseLogger logger : loggers) {
        //     logger.log("Values");
        // }

        CustomerManager customerManager = new CustomerManager(new FileLogger());
        customerManager.add();
    }
}
