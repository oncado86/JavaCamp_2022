package Calismalar.c_5_recapDemo1;

public class recapDemo1 {
    public static void main(String[] args) {
        int sayi1 = 122;
        int sayi2 = 21;
        int sayi3 = 25;
        int enBuyukSayi;

        if ((sayi2 > sayi1) && (sayi2 > sayi3))
            enBuyukSayi = sayi2;
        else if ((sayi3 > sayi1) && (sayi3 > sayi2))
            enBuyukSayi = sayi3;
        else
            enBuyukSayi = sayi1;
        
        System.out.println(String.format("En büyük sayı: %d", enBuyukSayi));
    }
}
