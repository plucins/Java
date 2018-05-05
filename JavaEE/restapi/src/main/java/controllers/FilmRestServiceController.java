package controllers;

import model.Comment;
import model.Film;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class FilmRestServiceController {
    private Map<Long, Film> films = DatabaseClass.getFilms();

    public Film addFilm(Film film){
        film.setId(films.size() + 1L);
        films.put(film.getId(),film);
        return film;
    }


    public Film getFilm(Long id){
        if(!films.containsKey(id)) throw new IllegalArgumentException();
        return films.get(id);
    }

    public int size(){
        return films.size();
    }

    public List<Film> getAllFilms(){
        return new ArrayList<>(films.values());
    }

    public void updateFilmInfo(Long filmToUpdateId, String newName){
        if(!films.containsKey(filmToUpdateId)) throw new IllegalArgumentException();
        films.get(filmToUpdateId).setFilmName(newName);
    }

    public List<Comment> getFilmComments(Long id){
        if(!films.containsKey(id)) throw new IllegalArgumentException();
        return films.get(id).getComments();
    }

    public void removeComment(Long id, Long commentId){
        if(!films.containsKey(id)) throw new IllegalArgumentException();
        films.get(id).removeComment(commentId);
    }

    public void addComment(Long id, String comment){
        if(!films.containsKey(id)) throw new IllegalArgumentException();
        films.get(id).addComment(comment);
    }
}
