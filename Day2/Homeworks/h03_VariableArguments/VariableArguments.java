package Homeworks.h03_VariableArguments;

/**
 * @version 1.0
 * @author <a href="https://github.com/oncado86">OnCaDo</a>
 * @category JAVA
 * @see * JAVA Yazılım Geliştirici Kampı 2022
 * 
 * @apiNote
 **          Variable Arguments ile çalışmak
 */
public class VariableArguments {
    public static void main(String[] args) {
        int number = sum(5, 7);
        int numbers = sum(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16);
        System.out.printf("Number: %d\nNumbers: %d\n", number, numbers);
    }

    /**
     * İki sayıyı toplar ve sonucu verir.
     * 
     * @param number1 -> birinci sayı (integer value)
     * @param number2 -> ikinci sayı (integer value)
     * @return
     */
    public static int sum(int number1, int number2) {
        return (number1 + number2);
    }

    /**
     * Girilen sayıların toplamını verir.
     * 
     * @param numbers -> sayılar (integer value)
     * @return sayılar toplamı (integer value)
     */
    public static int sum(int... numbers) {
        int total = 0;
        for (int number : numbers) {
            total += number;
        }
        return total;
    }
}
