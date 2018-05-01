package model;

import java.util.ArrayList;
import java.util.List;

public class Film {
    private int id;
    private String filmName;
    private List<String> comments = new ArrayList<>();
    private List<Double> rating = new ArrayList<>();

    public Film(int id, String filmName) {
        this.id = id;
        this.filmName = filmName;
    }

    protected int getId() {
        return id;
    }

    protected void setId(int id) {
        this.id = id;
    }

    public String getFilmName() {
        return filmName;
    }

    public void setFilmName(String filmName) {
        this.filmName = filmName;
    }

    public void addComment(String comment){
        comments.add(comment);
    }

    public void removeComment(String comment){
        if(comments.contains(comment)){
            comments.remove(comment);
        }else {
            throw new IllegalArgumentException();
        }
    }

    public List<String> getAllComments(){
        return comments;
    }

    public void addRate(Double rate){
        rating.add(rate);
    }
}
