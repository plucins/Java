package zadanie3.dziekanat;

import java.time.LocalDateTime;

class SocialSchoolarshipApplication extends Application {

    public SocialSchoolarshipApplication(String miejsceUtworzenia, Person daneAplikanta, String tresc) {
        super(LocalDateTime.now(), miejsceUtworzenia, daneAplikanta, tresc);
    }
}
