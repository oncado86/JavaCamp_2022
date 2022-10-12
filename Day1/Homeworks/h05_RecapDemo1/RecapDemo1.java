package Homeworks.h05_RecapDemo1;

/**
 * @version 1.0
 * @author <a href="https://github.com/oncado86">OnCaDo</a>
 * @category JAVA
 * @see * JAVA Yazılım Geliştirici Kampı 2022
 * 
 * @apiNote
 **          En büyük sayı hangisi?.
 */
public class RecapDemo1 {

    public static void main(String[] args) {
        int sayi1 = 122;
        int sayi2 = 21;
        int sayi3 = 25;
        int enBuyukSayi;

        if (sayi1 > sayi2 && sayi1 > sayi3)
            enBuyukSayi = sayi1;
        else if (sayi2 > sayi1 && sayi2 > sayi3)
            enBuyukSayi = sayi2;
        else
            enBuyukSayi = sayi3;

        System.out.println(String.format("En büyük sayı: %d", enBuyukSayi));
    }
}
