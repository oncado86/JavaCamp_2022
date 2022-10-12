package Education.OOP_1;


/**
 * @version 1.0
 * @author <a href="https://github.com/oncado86">OnCaDo</a>
 * @category JAVA
 * @see * JAVA Yazılım Geliştirici Kampı 2022
 * 
 ** @apiNote Bireysel müşteri
 */
public class IndividuolCustomer extends Customer {
    private String firstName; // ? adi
    private String lastName; // ? soyAdi

    /**
     * Müşteri adını getirir
     * 
     * @return müşteri adı
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Müşteri adını ayarlar
     * 
     * @param firstName -> müşteri adı
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Müşteri soyadını getirir
     * 
     * @return müşterinin soyadı
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Müşteri soyadını ayarlar
     * 
     * @param lastName -> müşteri soyadı
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
