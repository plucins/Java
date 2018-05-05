package controllers;

import model.Film;

import java.util.HashMap;
import java.util.Map;

public class DatabaseClass {
    private static Map<Long, Film> films = new HashMap<>();

    public static Map<Long, Film> getFilms(){
        return films;
    }
}
