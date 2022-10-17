package Homeworks.h01_OOP.entities;


public class Customer implements IEntitie {
    private int id;
    private String city;

    public Customer() {
    }

    public Customer(int id, String city) {
        this.id = id;
        this.city = city;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getName(IEntitie entity) { 
        return entity.getName();
        
    }

    @Override
    public String getName() {
        return null;
    }
}
