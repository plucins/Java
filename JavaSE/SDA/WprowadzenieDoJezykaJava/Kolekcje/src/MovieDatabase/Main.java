package MovieDatabase;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        MovieDataBase dataBase = new MovieDataBase();
        Movie movie = new Movie("mr. Robot",MovieType.ACTION,
                LocalDate.of(2015,01,01),"Piotr","Korek");
        Movie movie1 = new Movie("Koleszkowo",MovieType.COMEDY,
                LocalDate.of(2014,01,01),"Jan","Jankowski");
        Movie movie2 = new Movie("Kule dwie",MovieType.ACTION,
                LocalDate.of(2011,01,01),"Kowal","Kowalewski");

        dataBase.addMovie(movie1);
        dataBase.addMovie(movie2);
        dataBase.addMovie(movie);

        dataBase.getMovie("mr. Robot");
        dataBase.printAllMovies();
        System.out.println();
        dataBase.printAllMovies(MovieType.COMEDY);
    }
}
