package data;

import java.util.Objects;
import java.io.Serializable;
import java.time.LocalDate;

public abstract class Publication implements Serializable, Comparable<Publication> {
    private static final long serialVersionUID = 7910452641164094454L;
    
    private LocalDate date;
    private String title;
    private String publisher;

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    
    public int getYear(){
        return date.getYear();
    }

    protected Publication(int year, String title, String publisher) {
        setDate(LocalDate.of(year, 1, 1));
        setTitle(title);
        setPublisher(publisher);
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + Objects.hashCode(this.date);
        hash = 29 * hash + Objects.hashCode(this.title);
        hash = 29 * hash + Objects.hashCode(this.publisher);
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
        final Publication other = (Publication) obj;
        if (!Objects.equals(this.title, other.title)) {
            return false;
        }
        if (!Objects.equals(this.publisher, other.publisher)) {
            return false;
        }
        if (!Objects.equals(this.date, other.date)) {
            return false;
        }
        return true;
    }
    
    public int compareTo(Publication o){
        return title.compareTo(o.getTitle());
    }
   

}
