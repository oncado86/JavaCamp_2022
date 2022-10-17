package Education.oopWithNLayeredApp.core.logging;

public class DataBaseLogger implements Logger {

    @Override
    public void log(String data) {
        System.out.println(String.format("Veritabanına loglandı: %s", data));
    }

}
