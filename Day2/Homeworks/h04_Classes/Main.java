package Homeworks.h04_Classes;

/**
 * @version 1.0
 * @author <a href="https://github.com/oncado86">OnCaDo</a>
 * @category JAVA
 * @see * JAVA Yazılım Geliştirici Kampı 2022
 * 
 * @apiNote
 **          Class'lar ile çalışmak
 * @apiNote
 **          Class'ların ilk ve temel özelliği; gruplama yapmaktır.
 * @apiNote
 **          Class'lar Referans Tiptir
 */
public class Main {
    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager();
        customerManager.Add();
        customerManager.Remove();
        customerManager.Update();
    }
}
