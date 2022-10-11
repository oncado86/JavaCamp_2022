package Ders.OOP_1;

/**
 * @version 1.0
 * @author <a href="https://github.com/oncado86">OnCaDo</a>
 * @see * JAVA Yzılım Geliştirici Kampı 2022
 * @category JAVA
 * 
 ** @apiNote Kurumsal Müşteri
 */
public class CorporateCustomer extends Customer {
    private String companyName; // ? şirketAdi
    private String taxNumber; // ? vergiNumarasi

    /**
     * Şirket adını getirir
     * @return şirket adı (String)
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * Şirket adını ayarlar
     * @param companyName -> şirket adı (String)
     */
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    /**
     * Şirket vergi numarasını getirir
     * @return verigi numarası (String)
     */
    public String getTaxNumber() {
        return taxNumber;
    }

    /**
     * Şirket vergi numarasını ayarlar
     * @param taxNumber -> vergi numarası
     */
    public void setTaxNumber(String taxNumber) {
        this.taxNumber = taxNumber;
    }

}
