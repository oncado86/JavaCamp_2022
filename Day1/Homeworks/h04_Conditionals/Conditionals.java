package Homeworks.h04_Conditionals;

/**
 * @version 1.0
 * @author <a href="https://github.com/oncado86">OnCaDo</a>
 * @category JAVA
 * @see * JAVA Yazılım Geliştirici Kampı 2022
 * 
 * @apiNote
 **          Şart Bloklari
 */
public class Conditionals {

    public static void main(String[] args) {
        int sayi = 24;
        if (sayi < 20)
            System.out.println("Sayı 20'den küçüktür");
        else if (sayi == 20)
            System.out.println("Sayı 20'ye eşittir.");
        else
            System.out.println("Sayı 20'den büyüktür.");
    }
}
