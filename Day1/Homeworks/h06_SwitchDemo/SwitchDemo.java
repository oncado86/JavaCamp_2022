package Homeworks.h06_SwitchDemo;

/**
 * @version 1.0
 * @author <a href="https://github.com/oncado86">OnCaDo</a>
 * @category JAVA
 * @see * JAVA Yazılım Geliştirici Kampı 2022
 * 
 * @apiNote
 **          Karar yapısı.
 */
public class SwitchDemo {

    public static void main(String[] args) {
        char grade = 'A';

        switch (grade) {
            case 'A':
                System.out.println("Mükemmel: Geçtiniz.");
                break;
            case 'B':
                System.out.println("Çok Güzel: Geçtiniz.");
                break;
            case 'C':
                System.out.println("İyi: Geçtiniz.");
                break;
            case 'D':
                System.out.println("Fena Değil: Geçtiniz.");
                break;
            case 'F':
                System.out.println("Maalesef Kaldınız.");
                break;
            default:
                System.out.println("Geçersiz not girdiniz.");
                break;
        }
    }
}
