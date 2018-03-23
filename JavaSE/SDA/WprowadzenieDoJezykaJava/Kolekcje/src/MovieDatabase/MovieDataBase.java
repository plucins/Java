package MovieDatabase;

import java.util.HashMap;
import java.util.Map;

public class MovieDataBase {
    private Map<String, Movie> stringMovieMap = new HashMap<>();

    public void addMovie(Movie movie){
        this.stringMovieMap.put(movie.getFilmName(),movie);
    }

    public Movie getMovie(String name){
        return stringMovieMap.get(name);
    }

    public void printAllMovies(){
        for(Movie movie :stringMovieMap.values()){
            System.out.println(movie);
        }
    }

    public void printAllMovies(MovieType type){
        for(Movie movie :stringMovieMap.values()){
            if(movie.getMovieType().equals(type)) {
                System.out.println(movie);
            }
        }
    }
}
