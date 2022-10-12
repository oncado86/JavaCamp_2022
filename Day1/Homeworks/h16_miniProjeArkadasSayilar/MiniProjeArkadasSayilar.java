package Homeworks.h16_miniProjeArkadasSayilar;

import java.util.Scanner;

/**
 * @version 1.0
 * @author <a href="https://github.com/oncado86">OnCaDo</a>
 * @category JAVA
 * @see * JAVA Yazılım Geliştirici Kampı 2022
 * 
 * @apiNote
 *          * Arkadaş Sayılar mı?
 */

public class MiniProjeArkadasSayilar {

    public static void main(String[] args) {
        int[] numbers = new int[2];
        int[] divisorTotals = new int[2];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = getNumber();
        }

        for (int i = divisorTotals.length; i > 0; i--) {
            divisorTotals[((i - 1) * (-1))] = divisorSum(numbers[i]);
        }

        if (divisorTotals[0] == numbers[0] && divisorTotals[1] == numbers[1])
            System.out.printf("%d and %d are friendly numbers\n", numbers[0], numbers[1]);
        else
            System.out.printf("%d and %d are not friendly numbers\n", numbers[0], numbers[1]);
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
     * Kendisi hariç pozitif tam sayı bölenlerinin toplamını bulur
     * 
     * @param number -> hesaplanacak sayı
     * @return kendisi hariç pozitif tam sayı bölenlerinin toplamı (integer value)
     */
    private static int divisorSum(int number) {
        int divisorTotal = 1;
        for (int i = 1; i < number; i++) {
            if (number % i == 0)
                divisorTotal += i;
        }
        return divisorTotal;
    }
}
