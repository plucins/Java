package model;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement
public class Film {
    private Long id;
    private String filmName;
    private List<Comment> comments = new ArrayList<>();
    private List<Double> rating = new ArrayList<>();

    public Film(Long id, String filmName) {
        this.id = id;
        this.filmName = filmName;
    }

    public Film() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFilmName() {
        return filmName;
    }

    public void setFilmName(String filmName) {
        this.filmName = filmName;
    }

    public void addComment(String comment){
        Long id = getComments().size()+1L;
        comments.add(new Comment(id,comment));
    }

    public void removeComment(Long id){
        Comment comment = new Comment();
        for(Comment c: comments){
            if (c.getId().equals(id)) comment = c;
        }
        comments.remove(comment);
    }


    public List<Comment> getComments(){
        return comments;
    }

    public List<Double> getRating() {
        return rating;
    }

    public void addRate(Double rate){
        rating.add(rate);
    }
}
