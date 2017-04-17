package data;

import java.time.LocalDate;
import java.util.Objects;

public class Magazine extends Publication {
    private static final long serialVersionUID = 2061400934707882805L;

    private String language;

    public int getMonth() {
        return getDate().getMonthValue();
    }

    public int getDay() {
        return getDate().getDayOfMonth();
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Magazine(String title, String publisher, String language,
            int year, int month, int day) {
        super(year, title, publisher);
        setLanguage(language);
        setDate(LocalDate.of(year, month, day));
    }

    @Override
    public String toString() {
        return getTitle() + "; " + getPublisher() +"; " + getYear() + "-" +
                getMonth() + "-" + getDay() + "; " + getLanguage();
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + Objects.hashCode(this.language);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Magazine other = (Magazine) obj;
        if (!Objects.equals(this.language, other.language)) {
            return false;
        }
        return true;
    }
    
    
   

}
