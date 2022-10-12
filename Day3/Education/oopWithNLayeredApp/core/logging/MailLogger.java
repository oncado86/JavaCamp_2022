package core.logging;

public class MailLogger implements Logger {

    @Override
    public void log(String data) {
        System.out.println(String.format("E-posta gönderildi: %s", data));
    }

}
