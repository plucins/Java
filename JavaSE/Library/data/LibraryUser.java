
package data;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class LibraryUser extends User {
    private static final long serialVersionUID = 1704976407311180890L;
    
    private List<Publication> publicationHistory;
    private List<Publication> borrowedPublications;

    public List<Publication> getPublicationHistory() {
        return publicationHistory;
    }

    public List<Publication> getBorrowedPublications() {
        return borrowedPublications;
    }
    
    public LibraryUser(String firstName, String lastName, String pesel){
        super(firstName, lastName, pesel);
        publicationHistory = new ArrayList<>();
        borrowedPublications = new ArrayList<>();
    }
    
    private void addPublicationToHistory(Publication pub){
        publicationHistory.add(pub);
    }
    
    private void borrowPublication(Publication pub){
        borrowedPublications.add(pub);
    }
    
    public boolean returnPublications(Publication pub){
        boolean result = false;
        if(borrowedPublications.remove(pub)){
            result = true;
            addPublicationToHistory(pub);
        }
        return result;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + Objects.hashCode(this.publicationHistory);
        hash = 89 * hash + Objects.hashCode(this.borrowedPublications);
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
        final LibraryUser other = (LibraryUser) obj;
        if (!Objects.equals(this.publicationHistory, other.publicationHistory)) {
            return false;
        }
        if (!Objects.equals(this.borrowedPublications, other.borrowedPublications)) {
            return false;
        }
        return true;
    }
    
    
}
