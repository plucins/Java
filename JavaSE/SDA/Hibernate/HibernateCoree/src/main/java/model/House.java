package model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class House {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String street;
    private int number;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "house")
    Set<Mieszkaniec> mieszkaniecSet = new HashSet<Mieszkaniec>();

    public House() {
    }

    public House(String street, int number) {
        this.street = street;
        this.number = number;
    }

    public Set<Mieszkaniec> getMieszkaniecSet() {
        return mieszkaniecSet;
    }

    public void setMieszkaniecSet(Set<Mieszkaniec> mieszkaniecSet) {
        this.mieszkaniecSet = mieszkaniecSet;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
