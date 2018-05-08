package zadanie3.dziekanat;

import java.time.LocalDateTime;

public abstract class Application {
    private LocalDateTime dataUtworzenia;
    private String miejsceUtworzenia;
    private Person daneAplikanta;
    private String tresc;

    public Application(LocalDateTime dataUtworzenia, String miejsceUtworzenia, Person daneAplikanta, String tresc) {
        this.dataUtworzenia = dataUtworzenia;
        this.miejsceUtworzenia = miejsceUtworzenia;
        this.daneAplikanta = daneAplikanta;
        this.tresc = tresc;
    }
}
