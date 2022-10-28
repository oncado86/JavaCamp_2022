package Homeworks.h01_Methods;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @version 1.0
 * @author <a href="https://github.com/oncado86">OnCaDo</a>
 * @category JAVA
 * @see * JAVA Yazılım Geliştirici Kampı 2022
 * 
 * @apiNote
 **          Metotlarla çalışmak
 */
public class Methods {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> theNumberList = new ArrayList<Integer>();
        theNumberList = createList();

        System.out.print("Please enter a number for search: ");
        int theNumbertoSearch;
        theNumbertoSearch = getNumber();
        System.out.println(isTheNumberOnTheLiString(theNumbertoSearch, theNumberList));
    }

    /**
     * Sayı listesi oluşturur
     * 
     * @return sayı listesi (List)
     */
    private static ArrayList<Integer> createList() {
        System.out.println("Please enter a number for the number list: (-1 for the finish)");
        ArrayList<Integer> list = new ArrayList<Integer>();
        int number;
        while (true) {
            number = getNumber();
            if (number == -1)
                break;
            list.add(number);
        }

        return list;
    }

    /**
     * Konsoldan sadece sayı girişine izin verir
     * 
     * @return tam sayı
     */
    private static int getNumber() {
        // Scanner readConsole = new Scanner(System.in);
        int number;
        System.out.print("Please enter a number: ");
        try {
            Scanner readConsole = new Scanner(System.in);
            // number = Integer.parseInt(readConsole.next());

            number = readConsole.nextInt();
            return number;
        } catch (Exception e) {
            System.out.println("ERROR: Please enter just number!");
        }
        return 0;
    }

    /**
     * Bir tam sayının sayı listesinde olup olmadını kontrol eder
     * 
     * @param numberToSearch -> listede aranacak sayı (int)
     * @param theNumberList  -> tam sayı listesi (List)
     * @return Aranın sayının listede bulunma bilgisi (Strign)
     */
    private static String isTheNumberOnTheLiString(int numberToSearch, ArrayList<Integer> theNumberList) {
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