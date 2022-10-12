package Homeworks.h05_RecapDemo_Classes;

/**
 * @version 1.0
 * @author <a href="https://github.com/oncado86">OnCaDo</a>
 * @category JAVA
 * @see * JAVA Yazılım Geliştirici Kampı 2022
 * 
 * @apiNote
 **          Basit Hesaplamalar
 */
public class Main {
    public static void main(String[] args) {
        DortIslem dortIslem = new DortIslem();
        dortIslem.sonucuGoster(dortIslem.topla(1, 3, 5, 7, 9),"Toplam");
        dortIslem.sonucuGoster(dortIslem.carp(5, 15, 3), "Çarpım");
        dortIslem.sonucuGoster(dortIslem.bol(75, 5), "Bölüm");
        dortIslem.sonucuGoster(dortIslem.cikar(45, 7, 9), "Fark");
    }
}
