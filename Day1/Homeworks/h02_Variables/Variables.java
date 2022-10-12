package Homeworks.h02_Variables;

/**
 * @version 1.0
 * @author <a href="https://github.com/oncado86">OnCaDo</a>
 * @category JAVA
 * @see * JAVA Yazılım Geliştirici Kampı 2022
 * 
 * @apiNote
 **          Tam sayı (int) ve Metinsel (String) değişkenler.
 */
public class Variables {

    public static void main(String[] args) {
        int ogrenciSayisi = 12;
        String mesaj = "Öğrenci sayısı";

        System.out.println(String.format("%s: %d", mesaj, ogrenciSayisi));
    }
}
