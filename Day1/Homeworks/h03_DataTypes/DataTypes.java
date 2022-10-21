package Homeworks.h03_DataTypes;

/**
 * @version 1.0
 * @author <a href="https://github.com/oncado86">OnCaDo</a>
 * @category JAVA
 * @see * JAVA Yazılım Geliştirici Kampı 2022
 * 
 * @apiNote
 **          Veri tipleri.
 */
public class DataTypes {

    public static void main(String[] args) {

        boolean bValue = true; // ! true / false

        // ? Sayısal veri tipleri
        int iSayi = 12;
        byte bSayi = 127;

        // ? Ondalıklı sayılar
        float fSayi = 1.0f;
        double dValue = 3.15;

        // ? Metinsel veri tipleri
        char cValue = 'A';
        String metin = "Ankara";

        System.out.println(
                String.format("Boolean: %b\nInteger: %d\nByte: %d\nFloat: %f\nDouble: %f\nChar: %c\nString: %s",
                        bValue, iSayi, bSayi, fSayi, dValue, cValue, metin));
    }
}
