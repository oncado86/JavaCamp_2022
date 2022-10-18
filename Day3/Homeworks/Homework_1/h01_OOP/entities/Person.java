package Homeworks.h01_OOP.entities;

public class Person extends Customer {
    private String firstName;
    private String lastName;
    private String nationalNumber;

    public Person() {
    }

    public Person(int id, String firstName, String lastName, String city, String nationalNumber) {
        super(id, city);
        this.firstName = firstName;
        this.lastName = lastName;
        this.nationalNumber = nationalNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNationalNumber() {
        return nationalNumber;
    }

    public void setNationalNumber(String nationalNumber) {
        this.nationalNumber = nationalNumber;
    }

    @Override
    public String getName() {
        return getFirstName();
    }

}
