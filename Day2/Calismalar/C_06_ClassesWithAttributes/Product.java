package Calismalar.C_06_ClassesWithAttributes;

/**
 * @version 1.0
 * @author <a href="https://github.com/oncado86">OnCaDo</a>
 * @category JAVA
 * @see * JAVA Yazılım Geliştirici Kampı 2022
 * 
 * @apiNote
 **          Ürünün özellikleri
 */
public class Product {
    public Product() {
    }

    /**
     * @param id -> ürün ID'si
     * @param name -> ürün adı
     * @param description -> ürün tanımı/açıklaması
     * @param price -> ürün fiyatı
     * @param stockAmount ->ürün stok miktarı
     * @param color -> ürün rengi
     */
    public Product(int id, String name, String description, double price, int stockAmount, String color) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.stockAmount = stockAmount;
        this.color = color;
    }

    private int id;
    private String name;
    private String description;
    private double price;
    private int stockAmount;
    private String color;
    // private String code;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price > 0)
            this.price = price;
        else
            this.price = 0;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        if (stockAmount > 0)
            this.stockAmount = stockAmount;
        else
            this.stockAmount = 0;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCode() {
        return this.name.substring(0, 1) + this.id;
    }
}
