package Ders.OOP_1;

/**
 * @version 1.0
 * @author <a href="https://github.com/oncado86">OnCaDo</a>
 * @category JAVA
 * @see * JAVA Yzılım Geliştirici Kampı 2022
 * 
 ** @apiNote Müşteri
 */
public class Customer {

    private int id;
    private String customerNumber; // ? kullaniciNumarasi
    private String phoneNumber; // ? telefonNumarasi

    /**
     * ID numarasını getirir
     * 
     * @return ID
     */
    public int getId() {
        return id;
    }

    /**
     * ID numarasına ayarlar
     * 
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Kullanici numarasini döndürür
     * 
     * @return kullanıcı numarası (String)
     */
    public String getCustomerNumber() {
        return customerNumber;
    }

    /**
     * Kullamıcı numarası ataması yapar
     * 
     * @param customerNumber -> kullanici numarasi (String)
     */
    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }

    /**
     * Telefon numarasını getirir
     * 
     * @return telefon numarası (String)
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Telefon numarasını ayarlar
     * 
     * @param phoneNumber -> telefon numarası
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
