package Calismalar.C_17_MiniProjeSayiBulma;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MiniProjeSayıBulma {
    /**
     * @author <a href="https://github.com/oncado86">OnCaDo</a>
     * @deprecated JAVA Yazılım Geliştirici Kampı 2022
     * @version 1.0
     * 
     **          Sayı Listede Var Mı?
     */
    public static void main(String[] args) {
        System.out.println("Please enter a number for the number list: (-1 for the finish)");
        List<Integer> theNumberList = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);
        int number, theNumbertoSearch;
        while (true) {
            System.out.print("Please enter a number: ");
            number = getNumber();
            if (number == -1) {
                break;
            }
            theNumberList.add(number);
        }

        System.out.print("Please enter a number for search: ");
        theNumbertoSearch = getNumber();
        scanner.close();
        System.out.println(isTheNumberOnTheLiString(theNumbertoSearch, theNumberList));
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
        }
        readConsole.close();
        return 0;
    }

    private static String isTheNumberOnTheLiString(int numberToSearch, List<Integer> theNumberList) {
        boolean found = false;
        for (int number : theNumberList) {
            if (number == numberToSearch) {
                found = true;
                break;
            }
        }
        if (found)
            return String.format("%d is on the list", numberToSearch);
        return String.format("%d is NOT on the list", numberToSearch);
    }
}
