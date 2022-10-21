package Homeworks.Homework_2.h01_polymorphismDemo;

public class Main {
    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager(new FileLogger());
        customerManager.add();
    }
}
