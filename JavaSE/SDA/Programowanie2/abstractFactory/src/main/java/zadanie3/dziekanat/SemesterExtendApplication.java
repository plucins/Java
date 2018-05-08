package zadanie3.dziekanat;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

class SemesterExtendApplication extends Application {
    private String reason;

    public SemesterExtendApplication(String miejsceUtworzenia, Person daneAplikanta, String tresc, String reason) {
        super(LocalDateTime.now(), miejsceUtworzenia, daneAplikanta, tresc);
        this.reason = reason;
    }
}
