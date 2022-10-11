package Ders.OOP_1;

/**
 * @author <a href="https://github.com/oncado86">OnCaDo</a>
 * @deprecated JAVA Yazılım Geliştirici Kampı 2022
 * @version 1.0
 * 
 **          Classes (Sınıflar) PascalCase olarak isimlendirilir.
 **          Özellikleri camelCase olarak isimlendirilir
 **          Sınıflar şablon olarak kullanılabilir.
 */
public class Product { // ? Urün
    private String name; // ? UrünAdi
    private double unitPrice; // ? birimFiyati
    private double discount; // ? indirim oranı
    private String imageUrl; // ? urunResimAdresi
    private int unitsInStock; // ? stokMiktari

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public int getUnitsInStock() {
        return unitsInStock;
    }

    public void setUnitsInStock(int unitsInStock) {
        this.unitsInStock = unitsInStock;
    }

}
