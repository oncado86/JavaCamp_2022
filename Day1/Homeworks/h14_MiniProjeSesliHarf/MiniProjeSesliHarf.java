package Homeworks.h14_MiniProjeSesliHarf;

import java.util.Scanner;

/**
 * @version 1.0
 * @author <a href="https://github.com/oncado86">OnCaDo</a>
 * @category JAVA
 * @see * JAVA Yazılım Geliştirici Kampı 2022
 * 
 * @apiNote
 *          * Girilen değer sesli harf mi? Hangi tür?
 */
public class MiniProjeSesliHarf {
    
    public static void main(String[] args) {
        System.out.println(checkVowel(getChar()));
    }

    /**
     * Konsoldan harf almaya yarar.
     * @return String harf
     */
    private static String getChar() {
        String value = "";
        Scanner readConsole = new Scanner(System.in);
        String[] numbers = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" };
        boolean loops = true;

        do {
            System.out.print("Please enter a character: ");
            value = readConsole.next();
            if (value.length() == 1) {
                for (String number : numbers) {
                    if (value.equals(number)) {
                        System.out.println("Please enter a character!\n");
                        loops = true;
                        break;
                    } else {
                        loops = false;
                    }
                }
            } else
                System.out.println("Please enter a character!\n");
        } while (loops);

        readConsole.close();
        return value;
    }

    /**
     * Gelen değerin sesli harf olup olmadığını kontrol eder.
     * @param vowel -> String harf.
     * @return String türünde harf durum bilgisini döndürür.
     */
    private static String checkVowel(String vowel) {
        String[] boldVowels = { "a", "o", "u", "ı" };
        String[] thinVowels = { "e", "ö", "ü", "i" };

        for (String thinVowel : thinVowels) {
            if (vowel.toLowerCase().equals(thinVowel))
                return String.format("%s is a thin vowel.", vowel);
        }

        for (String boldVowel : boldVowels) {
            if (vowel.toLowerCase().equals(boldVowel))
                return String.format("%s is a bold vowel.", vowel);
        }

        return String.format("%s is not a vowel", vowel);
    }
}
