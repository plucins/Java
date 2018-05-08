package zadanie3.dziekanat;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

class ConditionalStayApplication extends Application {

    private List<Double> grades = new ArrayList<>();
    private String reason;

    public ConditionalStayApplication(String miejsceUtworzenia, Person daneAplikanta, String tresc, List<Double> grades, String reason) {
        super(LocalDateTime.now(), miejsceUtworzenia, daneAplikanta, tresc);
        this.grades = grades;
        this.reason = reason;
    }
}
