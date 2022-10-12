package Homeworks.h08_ArraysDemo;

/**
 * @version 1.0
 * @author <a href="https://github.com/oncado86">OnCaDo</a>
 * @category JAVA
 * @see * JAVA Yazılım Geliştirici Kampı 2022
 * 
 * @apiNote
 **          Dizilerle çalışmak.
 */
public class ArraysDemo {

    public static void main(String[] args) {
        String ogrenci1 = "Onur";
        String ogrenci2 = "İsmail";
        String ogrenci3 = "Burak";
        String ogrenci4 = "Mesut";

        System.out.println(ogrenci1);
        System.out.println(ogrenci2);
        System.out.println(ogrenci3);
        System.out.println(ogrenci4);
        System.out.println("--------------------------------");

        // ? Dizi tanımlaması
        String[] ogrenciler = { "Onur", "İsmail", "Mesut", "Burak" };
        for (int i = 0; i < ogrenciler.length; i++) {
            System.out.println(ogrenciler[i]);
        }
        System.out.println("--------------------------------");

        // ! Foreach yöntemi
        for (String ogrenci : ogrenciler) {
            System.out.println(ogrenci);
        }
    }
}
