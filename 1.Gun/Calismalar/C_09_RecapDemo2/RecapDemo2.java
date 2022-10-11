package Calismalar.C_09_RecapDemo2;

public class RecapDemo2 {
    /**
     * @author <a href="https://github.com/oncado86">OnCaDo</a>
     * @deprecated JAVA Yazılım Geliştirici Kampı 2022
     * @version 1.0
     * 
     */
    public static void main(String[] args) {
        double[] myList = { 1.2, 1.3, 4.3, 5.6 };
        double total, maxNumber;
        total = maxNumber = 0;

        for (double number : myList) {
            total += number;
            System.out.println(number);
            maxNumber = maxNumber < number ? number : maxNumber;
        }
        System.out.printf("Total: %f  \n", total);
        System.out.printf("Max Number: %f\n", maxNumber);
    }
}
