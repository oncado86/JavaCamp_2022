package Homeworks.h13_MiniProjeAsalSayi;

import java.util.Scanner;

/**
 * @version 1.0
 * @author <a href="https://github.com/oncado86">OnCaDo</a>
 * @category JAVA
 * @see * JAVA Yazılım Geliştirici Kampı 2022
 * 
 * @apiNote
 *          * Girilen değer asal sayı mı?
 */
public class MiniProjeAsalSayi {

    public static void main(String[] args) {
        System.out.println(isPrimeNumber(getNumber()));
    }

    /**
     * Konsoldan sadece sayı girişine izin verir
     * 
     * @return tam sayı
     */
    private static int getNumber() {
        int number;
        System.out.print("Please enter a number: ");
        Scanner readConsole = new Scanner(System.in);
        try {
            number = Integer.parseInt(readConsole.next());
            readConsole.close();
            return number;
        } catch (Exception e) {
            System.out.println("ERROR: Please entere just number!");
            return getNumber();
        }
    }

    /**
     * Girilen tam sayının 2'den büyük ve tek sayı olma durumunu inceler!
     * çift sayılar asal sayı değildir :)
     * 
     * @param number -> kontrol edilecek tam sayı
     * @return true / false
     */
    private static boolean checkNumber(int number) {
        if (((number < 2) || (number % 2 == 0)) && (number != 2))
            return false;
        return true;
    }

    /**
     * Girilen tam sayının asal sayı olup olmadığını kontrol eder
     * 
     * @param number -> kontrol edilecek tam sayı
     * @return tam sayının asal sayı olma bilgisi (String)
     */
    private static String isPrimeNumber(int number) {
        if (checkNumber(number)) {
            for (int i = 2; i < number; i++) {
                if (number % i == 0)
                    return String.format("%s is not a prime number", number);
            }
            return String.format("%s is a prime number", number);
        }
        return String.format("%s is not a prime number", number);
    }
}
