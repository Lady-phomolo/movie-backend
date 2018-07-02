/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.movies.store.service.Impl;

import com.movies.store.dao.MovieDao;
import com.movies.store.entities.Movie;
import com.movies.store.model.MovieModel;
import com.movies.store.service.MovieService;
import com.movies.store.transformer.MovieTransformer;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author phomolo
 */
@Service
public class MovieServiceImpl implements MovieService {

    @Autowired
    MovieDao movieDao;

    @Autowired
    MovieTransformer movieTransformer;

    @Override
    public List<MovieModel> movieList() {

        return movieTransformer.toModels(movieDao.findAll());
    }

    @Override
    public MovieModel findMovieById(Long id) {

        return movieTransformer.toModel(movieDao.findById(id).get());
    }

    @Override
    public MovieModel addMovie(MovieModel movieModel) {

        Movie movie = new Movie();
        movieTransformer.fillFromModel(movie, movieModel);
        movie = movieDao.save(movie);
        return movieTransformer.toModel(movie);

    }

    @Override
    public MovieModel updateMovie(MovieModel movieModel) {
        Movie movie = new Movie();
        movieTransformer.fillFromModel(movie, movieModel);
        movie = movieDao.save(movie);
        return movieTransformer.toModel(movie);
    }

}
