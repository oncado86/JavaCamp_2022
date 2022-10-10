package Ders.intro;

public class Main {

    /**
     * @author <a href="https://github.com/oncado86">OnCaDo</a>
     * @deprecated JAVA Yazılım Geliştirici Kampı 2022
     * @version 1.0
     * 
     **          Main Java'da programın başlama noktasıdır.
     */

    public static void main(String[] args) {
        System.out.println("Hello World!\n");

        // ! Değişken isimlendirmeleri Java'da camelCase yazılır.
        // String value: Metinsel veri/değer tutar.
        String ortaMetin = "İlginizi çekebilir.\n";
        // String altMetin = "Vade süresi";
        System.out.println(ortaMetin);

        // integer value: tam sayı veri/değer tutar.
        // int vade = 12;

        // double value: ondalıklı sayı veri/değer tutar.
        double dolarDun = 18.14;
        double dolarBugun = 18.10;

        // boolean value: true/false (doğru/yalış) bilgisini tutar.
        // boolean dolarDustuMu = false;

        String okYonu;

        // if: şart blokları, karar yapısıdır.
        if (dolarBugun < dolarDun) {// !true ? false
            okYonu = "down.svg";
        } else if (dolarBugun > dolarDun) {
            okYonu = "up.svg";
        } else {
            okYonu = "equal.svg";
        }
        System.out.println(okYonu + "\n");

        // Array value: benzer türdeki verileri/değerleri tutar.
        String[] krediler = {
                "Hızlı Kredi",
                "Maaşını Bizden Alanlar",
                "Mutlu Emekli" };

        // For loops: kodları tekrarlamaya yarar.
        // * foreach loops: for döngüsü gibi çalışır. Farkı, diziler/listeler için
        // * özelleştirilmiş for döngüsüdür.
        for (String kredi : krediler) {
            System.out.println(kredi);
        }
        System.out.println();
        for (int i = 0; i < krediler.length; i++) {
            System.out.println(krediler[i]);
        }
    }
}