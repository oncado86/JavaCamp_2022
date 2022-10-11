package Calismalar.C_06_SwitchDemo;

public class SwitchDemo {
    /**
     * @author <a href="https://github.com/oncado86">OnCaDo</a>
     * @deprecated JAVA Yazılım Geliştirici Kampı 2022
     * @version 1.0
     * 
     **          Karar yapısı.
     */
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
