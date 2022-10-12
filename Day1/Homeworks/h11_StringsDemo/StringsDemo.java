package Homeworks.h11_StringsDemo;

/**
 * @version 1.0
 * @author <a href="https://github.com/oncado86">OnCaDo</a>
 * @category JAVA
 * @see * JAVA Yazılım Geliştirici Kampı 2022
 * 
 * @apiNote
 **          String metotları-1.
 */
public class StringsDemo {
    
    public static void main(String[] args) {
        String mesaj = "Bugün hava çok güzel.";
        System.out.println(mesaj);
        System.out.printf("Eleman sayısı: %d\n", mesaj.length());// metnin karakter sayısını verir
        System.out.printf("5. eleman: '%s'\n", mesaj.charAt(4));// metnin 4. indeksindeki (5. eleman) karakteri verir
        System.out.println(mesaj.concat(" Yaşasın!.")); // iki metni birleştirip geri döndürür
        System.out.printf("%s %s\n", mesaj, "Yaşasın!."); // stringFormat
        System.out.println(mesaj.startsWith("A")); // metnin belirli bir karakter(lerle) başladığını kontrol eder
        System.out.println(mesaj.endsWith(".")); // metnin belirli bir karakter(lerle) bitimini kontrol eder
        char[] karakterler = new char[5];
        mesaj.getChars(0, 5, karakterler, 0); // metinden belirli bir karakter dizisini alır ve bir karakter dizisine
                                              // atar
        System.out.println(mesaj.indexOf("a")); // metindeki belirli bir karakterin soldan sayıp indeks numarasını verir
        System.out.println(mesaj.lastIndexOf("e")); // metind belirli bir katakterin sağdan sayıp indeks numarasını
                                                    // verir

    }
}
