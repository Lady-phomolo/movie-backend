/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.movies.store.service;

import com.movies.store.entities.Movie;
import com.movies.store.model.MovieModel;
import java.util.List;

/**
 *
 * @author phomolo
 */
public interface MovieService {

    List<MovieModel> movieList();

    MovieModel findMovieById(Long id);

    MovieModel addMovie(MovieModel movieModel);

    MovieModel updateMovie(MovieModel movieModel);
}
