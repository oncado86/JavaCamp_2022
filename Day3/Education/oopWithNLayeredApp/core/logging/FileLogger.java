package core.logging;

public class FileLogger implements Logger {

    @Override
    public void log(String data) {
        System.out.println(String.format("Dosyaya loglandı: %s", data));
    }

}
