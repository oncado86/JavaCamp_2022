package Calismalar.c_10_multiDimensionalArrayDemo;

public class multiDimensionalArrayDemo {
    /**
     * @author <a href="https://github.com/oncado86">OnCaDo</a>
     * @deprecated JAVA Yazılım Geliştirici Kampı 2022
     * @version 1.0
     * 
     **          Çok boyutlu diziler.
     */
    public static void main(String[] args) {
        String[][] sehirler = {
                { "İstanbul", "Bursa", "Bilecik" },
                { "Ankara", "Konya", "Kayseri" },
                { "İzmir", "Aydın", "Manisa" } };

        for (int i = 0; i < sehirler.length; i++) {
            System.out.println("----------------------------");
            for (int j = 0; j < sehirler.length; j++) {
                System.out.println(sehirler[i][j]);
            }
        }
        System.out.println("----------------------------");
    }
}
