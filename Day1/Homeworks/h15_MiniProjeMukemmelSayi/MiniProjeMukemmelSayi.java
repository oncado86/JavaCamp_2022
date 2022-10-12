package Homeworks.h15_MiniProjeMukemmelSayi;

import java.util.Scanner;

/**
 * @version 1.0
 * @author <a href="https://github.com/oncado86">OnCaDo</a>
 * @category JAVA
 * @see * JAVA Yazılım Geliştirici Kampı 2022
 * 
 * @apiNote
 *          * Mükemmel sayı mı?
 */
public class MiniProjeMukemmelSayi {
    
    public static void main(String[] args) {
        System.out.println(isPerfectNumber(getNumber()));
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
            System.out.println("ERROR: Please enter just number!");
            return getNumber();
        }
    }

    /**
     * Sayının mükemmel sayı olma durumunu inceler.
     * 
     * @param number int sayı
     * @return String sayının mükemmel sayı olma durumunu döndürür
     */
    private static String isPerfectNumber(int number) {
        int divisorSum = 1;
        String message = "";

        for (int i = 2; i < number; i++) {
            if (number % i == 0)
                divisorSum += i;
        }
        if (divisorSum == number)
            message = String.format("%d is perfect number.", number);
        else
            message = String.format("%d is not perfect number.", number);

        return message;
    }
}
