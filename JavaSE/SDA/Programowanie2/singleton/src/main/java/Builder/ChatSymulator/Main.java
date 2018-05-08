package Builder.ChatSymulator;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        MailServer server = new MailServer();
        Client c1 = new Client("Adam");
        Client c2 = new Client("Roman");
        Client c3 = new Client("Ola");

        server.connect(c1);
        server.connect(c2);
        server.connect(c3);

        Mail m = new Mail.Builder()
                .setNadawca("Janeczek")
                .setDataNadania(LocalDate.of(2018,01,01))
                .build();

        server.sendMessage(m,c1);
    }
}
