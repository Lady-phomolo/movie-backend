/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.movies.store.transformer;

import com.movies.store.entities.Movie;
import com.movies.store.model.MovieModel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 *
 * @author phomolo
 */
@Component
public class MovieTransformer {

    public MovieModel toModel(Movie entity) {
        MovieModel model = new MovieModel();
        if (entity != null) {
            model.setMovieId(entity.getMovieId());
            model.setMovieCategory(entity.getMovieCategory());
            model.setMovieTitle(entity.getMovieTitle());
            model.setMovieStatus(entity.getMovieStatus());

        }
        return model;
    }

    public List<MovieModel> toModels(List<Movie> entities) {
        List<MovieModel> models = Collections.emptyList();
        if (entities != null) {
            models = new ArrayList<>();
            for (Movie movie : entities) {
                models.add(toModel(movie));
            }
        }
        return models;
    }

    public void fillFromModel(Movie entity, MovieModel model) {

        if (entity != null && model != null) {
            entity.setMovieId(model.getMovieId());
            entity.setMovieCategory(model.getMovieCategory());
            entity.setMovieTitle(model.getMovieTitle());
            entity.setMovieStatus(model.getMovieStatus());
        }
    }
}
