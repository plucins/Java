package fields;

import java.time.LocalDate;
import java.util.List;

public class Actor {
    private String actorName;
    private LocalDate actorDayOfBirth;
    private String actorBiography;
    private List<Actor> actors;

    public String getActorName() {
        return actorName;
    }

    public void setActorName(String actorName) {
        this.actorName = actorName;
    }

    public LocalDate getActorDayOfBirth() {
        return actorDayOfBirth;
    }

    public void setActorDayOfBirth(LocalDate actorDayOfBirth) {
        this.actorDayOfBirth = actorDayOfBirth;
    }

    public String getActorBiography() {
        return actorBiography;
    }

    public void setActorBiography(String actorBiography) {
        this.actorBiography = actorBiography;
    }

    public List<Actor> getActors() {
        return actors;
    }

    public void setActors(List<Actor> actors) {
        this.actors = actors;
    }

    @Override
    public String toString() {
        return "Actor{" +
                "actorName='" + actorName + '\'' +
                ", actorDayOfBirth=" + actorDayOfBirth +
                ", actorBiography='" + actorBiography + '\'' +
                ", actors=" + actors +
                '}';
    }
}
