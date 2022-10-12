package Homeworks.h07_LoopDemo;

/**
 * @version 1.0
 * @author <a href="https://github.com/oncado86">OnCaDo</a>
 * @category JAVA
 * @see * JAVA Yazılım Geliştirici Kampı 2022
 * 
 * @apiNote
 **          Döngüler kodları tekrarlamaya yarar.
 */
public class LoopDemo {

    public static void main(String[] args) {

        // ? For Döngüsünde, şart ve artış en baştan belirlenir.
        for (int i = 2; i < 10; i += 2) {
            System.out.println(i);
        }
        System.err.println("For Döngüsü bitti!");

        // ? While Döngüsünde artış döngü içinde belirtilmelidir.
        int i = 2;
        while (i < 10) {
            System.out.println(i);
            i += 2;
        }
        System.out.println("While Döngüsü bitti!");

        // ? Do-While Döngüsü şart sağlanmasa da en az 1 defa çalışır.
        int j = 100;
        do {
            System.out.println(j);
            j += 2;
        } while (j < 10);
        System.out.println("Do-While Döngüsü bitti!");
    }
}
