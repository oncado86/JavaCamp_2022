package Day1.Calismalar.C_12_StringsDemo2;

public class StringsDemo {
    /**
     * @author <a href="https://github.com/oncado86">OnCaDo</a>
     * @deprecated JAVA Yazılım Geliştirici Kampı 2022
     * @version 1.0
     * 
     **          String metotları-2.
     */
    public static void main(String[] args) {
        String mesaj = "Bugün hava çok güzel.";
        System.out.println(mesaj);

        // bir metnin içersindeki karakterleri değiştirir
        String yeniMesaj = mesaj.replace(" ", "-");
        System.out.println(yeniMesaj);

        // bir metinden parça alır
        System.out.println(mesaj.substring(2));
        System.out.println(mesaj.substring(2, 5));

        // bir metni belirli bir karakter/ karakter dizisini dikkate alrak parçalar
        for (String kelime : mesaj.split(" ")) {
            System.out.println(kelime);
        }

        // metindeki tüm karaktereri küçük harfe çevirir.
        System.out.println(mesaj.toLowerCase());

        // metindeki tüm karaktereri büyük harfe çevirir.
        System.out.println(mesaj.toUpperCase());

        // metnin başındaki ve sonunda boşlukları atar.
        System.out.println(mesaj.trim());
    }
}
