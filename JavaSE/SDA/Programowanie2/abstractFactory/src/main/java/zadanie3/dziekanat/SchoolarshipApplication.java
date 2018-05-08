package zadanie3.dziekanat;

import java.time.LocalDateTime;

class SchoolarshipApplication extends Application {

    public SchoolarshipApplication(String miejsceUtworzenia, Person daneAplikanta, String tresc) {
        super(LocalDateTime.now(), miejsceUtworzenia, daneAplikanta, tresc);
    }
}
