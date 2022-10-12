package Homeworks.h02_Methods2;

/**
 * @version 1.0
 * @author <a href="https://github.com/oncado86">OnCaDo</a>
 * @category JAVA
 * @see * JAVA Yazılım Geliştirici Kampı 2022
 * 
 * @apiNote
 **          Metotlarla çalışmak
 */
public class Methods2 {
    public static void main(String[] args) {
        String message = "Bugün hava çok güzel.";
        String newMessage = message.substring(0, 5);
        String city = getCity();
        System.out.println(newMessage + city);
        int number = sumNumbers(1, 2, 3, 4, 5);
        System.out.println(number);

    }

    public static void add() {
        System.out.println("Adding");
    }

    public static void delete() {
        System.out.println("Deleting");
    }

    public static void update() {
        System.out.println("Updating");
    }

    public static int number() {
        return 13;
    }

    public static String getCity() {
        return "Ankara";
    }

    public static int sumNumbers(int... numbers) {
        int total = 0;
        for (int number : numbers) {
            total += number;
        }
        return total;
    }
}
