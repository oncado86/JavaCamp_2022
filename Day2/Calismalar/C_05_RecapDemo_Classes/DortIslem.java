package Calismalar.C_05_RecapDemo_Classes;

public class DortIslem {
    /**
     * Parametre ile alınan sayılar toplanır ve sonuç geri döndürülür.
     * 
     * @param numbers -> toplanacak sayılar
     * @return toplam sonucu geri döndürülür (int)
     */
    public int topla(int... numbers) {
        int total = 0;
        for (int number : numbers) {
            total += number;
        }
        return total;
    }

    /**
     * Parametre ile alınan sayılar birbirinden çıkarılır ve sonuç geri döndürülür.
     * 
     * @param numbers -> farkı alınacak sayılar
     * @return fark sonucu geri döndürülür (int)
     */
    public int cikar(int... numbers) {
        int fark = numbers[0];
        for (int i = 1; i <= numbers.length; i++) {
            fark -= i;
        }
        return fark;
    }

    /**
     * 
     * @param bolunen -> bölünecek olan sayı alınır
     * @param bolen   -> bölünecek olan sayıyı bölecek olan sayı alınır
     * @return bölüm sonucu geri döndürülür
     */
    public int bol(int bolunen, int bolen) {

        return bolunen / bolen;
    }

    /**
     * 
     * @param sayilar ile sayılar lisesi alınır
     *                listedeki tüm sayılar sırayla bir biriyle çarpılır
     * @return çarpım sonucu geri döndürülür
     */
    public int carp(int... numbers) {
        int carpim = 1;
        for (int number : numbers) {
            carpim *= number;
        }
        return carpim;
    }

    public void sonucuGoster(int sonuc, String mesaj) {
        System.out.println(String.format("%s: %d", mesaj, sonuc));
    }
}
