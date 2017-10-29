package fields;


import java.time.Duration;
import java.time.LocalDate;

public class Episode {
    private String episodeName;
    private LocalDate episodeReleaseDate;
    private int episodeNumber;
    private Duration episodeDuration;

    public String getEpisodeName() {
        return episodeName;
    }

    public void setEpisodeName(String episodeName) {
        this.episodeName = episodeName;
    }

    public LocalDate getEpisodeReleaseDate() {
        return episodeReleaseDate;
    }

    public void setEpisodeReleaseDate(LocalDate episodeReleaseDate) {
        this.episodeReleaseDate = episodeReleaseDate;
    }

    public int getEpisodeNumber() {
        return episodeNumber;
    }

    public void setEpisodeNumber(int episodeNumber) {
        this.episodeNumber = episodeNumber;
    }

    public Duration getEpisodeDuration() {
        return episodeDuration;
    }

    public void setEpisodeDuration(Duration episodeDuration) {
        this.episodeDuration = episodeDuration;
    }

    @Override
    public String toString() {
        return "Episode{" +
                "episodeName='" + episodeName + '\'' +
                ", episodeReleaseDate=" + episodeReleaseDate +
                ", episodeNumber=" + episodeNumber +
                ", episodeDuration=" + episodeDuration +
                '}';
    }
}
