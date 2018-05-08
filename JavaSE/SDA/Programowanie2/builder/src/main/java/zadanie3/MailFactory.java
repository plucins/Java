package zadanie3;

import java.time.LocalDate;

public abstract class MailFactory {

    public static Mail createNotificationMail(String oferta){
        return new Mail.Builder().setSzyfrowac(false)
                .setDataNadania(LocalDate.now())
                .setSpam(false)
                .setTresc("Witaj w sklepie " + oferta)
                .createMail();
    }

    public static Mail createWarningMail(String about){
        return new Mail.Builder().setSzyfrowac(true)
                .setSpam(false)
                .setTresc("to jest spam o " + about)
                .createMail();
    }
}
