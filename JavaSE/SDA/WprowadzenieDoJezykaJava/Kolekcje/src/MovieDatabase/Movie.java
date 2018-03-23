package MovieDatabase;

import java.time.LocalDate;

public class Movie {
    private String filmName;
    private MovieType movieType;
    private LocalDate releaseDate;
    private String directorName;
    private String directorLastName;

    public Movie(String filmName, MovieType movieType, LocalDate releaseDate, String directorName, String directorLastName) {
        this.filmName = filmName;
        this.movieType = movieType;
        this.releaseDate = releaseDate;
        this.directorName = directorName;
        this.directorLastName = directorLastName;
    }

    public String getFilmName() {
        return filmName;
    }

    public void setFilmName(String filmName) {
        this.filmName = filmName;
    }

    public MovieType getMovieType() {
        return movieType;
    }

    public void setMovieType(MovieType movieType) {
        this.movieType = movieType;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getDirectorName() {
        return directorName;
    }

    public void setDirectorName(String directorName) {
        this.directorName = directorName;
    }

    public String getDirectorLastName() {
        return directorLastName;
    }

    public void setDirectorLastName(String directorLastName) {
        this.directorLastName = directorLastName;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "filmName='" + filmName + '\'' +
                ", movieType=" + movieType +
                ", releaseDate=" + releaseDate +
                ", directorName='" + directorName + '\'' +
                ", directorLastName='" + directorLastName + '\'' +
                '}';
    }
}
