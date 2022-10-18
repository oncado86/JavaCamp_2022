package Homeworks.h01_OOP.entities;

public class Company extends Customer {
    private String companyName;
    private String taxNumber;

    public Company() {
    }

    public Company(int id, String companyName, String city, String taxNumber) {
        super(id, city);
        this.companyName = companyName;
        this.taxNumber = taxNumber;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getTaxNumber() {
        return taxNumber;
    }

    public void setTaxNumber(String taxNumber) {
        this.taxNumber = taxNumber;
    }

    @Override
    public String getName() {
        return getCompanyName();
    }
}
