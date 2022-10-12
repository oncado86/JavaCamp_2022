package Education.OOP_1;

/**
 * @version 1.0
 * @author <a href="https://github.com/oncado86">OnCaDo</a>
 * @see * JAVA Yazılım Geliştirici Kampı 2022
 * @category JAVA
 * 
 ** @apiNote Classes (Sınıflar) PascalCase olarak isimlendirilir.
 ** @apiNote Özellikleri camelCase olarak isimlendirilir
 ** @apiNote Sınıflar şablon olarak kullanılabilir.
 ** @apiNote Ürün 
 */
public class Product { // ? Urün
    private String name; // ? UrünAdi
    private double unitPrice; // ? birimFiyati
    private double discount; // ? indirim oranı
    private String imageUrl; // ? urunResimAdresi
    private int unitsInStock; // ? stokMiktari

    /**
     * Ürün adını getirir
     * 
     * @return ürün adı
     */
    public String getName() {
        return name;
    }

    /**
     * Ürün adını ayarlar
     * 
     * @param name -> ürün adı
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Ürün birin fiyatını getirir
     * 
     * @return ürün birim fiyatı (int)
     */
    public double getUnitPrice() {
        return unitPrice;
    }

    /**
     * Ürün birim fiyatını ayarlar
     * 
     * @param unitPrice -> ürün birim fiyatı (int)
     */
    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    /**
     * Ürün indirim oranını getirir
     * 
     * @return indirim oranı (double)
     */
    public double getDiscount() {
        return discount;
    }

    /**
     * Ürün indirim oranını ayarlar
     * 
     * @param discount -> indirim oranı (double)
     */
    public void setDiscount(double discount) {
        this.discount = discount;
    }

    /**
     * Ürünün resmini getirir
     * 
     * @return Ürün resmini getirir (String)
     */
    public String getImageUrl() {
        return imageUrl;
    }

    /**
     * Ürünün resmini ayarlar
     * 
     * @param imageUrl -> ürün resmi (String : URL)
     */
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    /**
     * Ürünün stok miktarını getirir
     * 
     * @return ürünün stok miktarı (int)
     */
    public int getUnitsInStock() {
        return unitsInStock;
    }

    /**
     * Ürünün stoktaki miktarını ayarlar
     * 
     * @param unitsInStock -> ürün stok miktarı (int)
     */
    public void setUnitsInStock(int unitsInStock) {
        this.unitsInStock = unitsInStock;
    }
}
