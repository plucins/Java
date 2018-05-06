package controllers;

import model.Comment;
import model.Film;

import javax.ws.rs.*;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/films")
public class RestEndpointController {

    private FilmRestServiceController controller = new FilmRestServiceController();


    @GET
    @Path("/get/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Film getPointedFil(@PathParam("id") Long id){
        return controller.getFilm(id);
    }

    @POST
    @Path("/add")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Film addFilmToMap(Film film){
        controller.addFilm(film);
        return film;
    }

    @GET
    @Path("/get/films")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAllFilms(){
        List<Film> films = controller.getAllFilms();
        GenericEntity<List<Film>> genericEntity = new GenericEntity<List<Film>>(films){};
        return Response.ok(genericEntity).build();
    }

    @POST
    @Path("/add/{id}/comment")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Film addCommentToFilm(Comment comment, @PathParam("id") Long id){
        controller.addComment(id,comment.getText());
        return controller.getFilm(id);
    }

    @GET
    @Path("/remove/{id}/comment/{commentId}")
    @Produces(MediaType.APPLICATION_JSON)
    public Film removeComment(@PathParam("id") Long id,@PathParam("commentId") Long commentId){
        controller.removeComment(id,commentId);
        return controller.getFilm(id);
    }

    @GET
    @Path("/get/{id}/comments")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAllCOmmentsForPointedFilm(@PathParam("id") Long id){
        List<Comment> comments = controller.getFilmComments(id);
        GenericEntity<List<Comment>> genericEntity = new GenericEntity<List<Comment>>(comments){};
        return Response.ok(genericEntity).build();
    }

    @PUT
    @Path("/get/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Film changeFilmName(@PathParam("id") Long id, Film film){
        controller.updateFilmInfo(id,film.getFilmName());
        return controller.getFilm(id);
    }
}
