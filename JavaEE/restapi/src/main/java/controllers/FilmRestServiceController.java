package controllers;

import model.Film;

import java.util.*;

public class FilmRestServiceController {
    private Map<Integer, Film> films = new HashMap<>();

    public void addFilm(String name){
        films.put(findLargestKey(),new Film(findLargestKey(),name));
    }

    private Integer findLargestKey(){
        Optional<Integer> f = films.keySet().stream().max(Comparator.naturalOrder());
        return f.orElse(0);
    }

    public Film getFilm(int id){
        return films.get(id);
    }

    public List<Film> getAllFilms(){
        return new ArrayList<>(films.values());
    }

    public void updateFilmInfo(int filmToUpdateId, String newName){
        if(!films.containsKey(filmToUpdateId)) throw new IllegalArgumentException();
        films.get(filmToUpdateId).setFilmName(newName);
    }

    public List<String> getFilmComments(int id){
        if(!films.containsKey(id)) throw new IllegalArgumentException();
        return films.get(id).getAllComments();
    }

    public void removeComment(int id, String comment){
        if(!films.containsKey(id)) throw new IllegalArgumentException();
        films.get(id).removeComment(comment);
    }

    public void addComment(int id, String comment){
        if(!films.containsKey(id)) throw new IllegalArgumentException();
        films.get(id).addComment(comment);
    }
}
