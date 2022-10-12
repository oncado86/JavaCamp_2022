package Homeworks.h07_MethodOverloading;

/**
 * @version 1.0
 * @author <a href="https://github.com/oncado86">OnCaDo</a>
 * @category JAVA
 * @see * JAVA Yazılım Geliştirici Kampı 2022
 * 
 * @apiNote
 **          Method Overloading; Metot aşırı yükleme
 */
public class Main {
    public static void main(String[] args) {
        DortIslem dortIslem = new DortIslem();
        System.out.println(dortIslem.topla(1, 2));
        System.out.println(dortIslem.topla(1, 2, 3));
        System.out.println(dortIslem.topla(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
    }
}
