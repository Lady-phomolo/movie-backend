/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.movies.store.Controller;

import com.movies.store.entities.Movie;
import com.movies.store.model.MovieModel;
import com.movies.store.service.MovieService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author phomolo
 */
@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
public class MovieController {

    @Autowired
    private MovieService movieService;

    @RequestMapping(method = RequestMethod.GET, value = "/list")
    public List<MovieModel> movieList() {
        return movieService.movieList();
    }

    @RequestMapping(value = "/list/{id}")
    public MovieModel findById(@PathVariable Long id) {
        return movieService.findMovieById(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/add")
    public MovieModel addMovie(@RequestBody MovieModel movie) {
       return  movieService.addMovie(movie);

    }

    @RequestMapping(method = RequestMethod.PUT, value = "/update")
    public MovieModel updateMovie(@RequestBody MovieModel movie) {
       return movieService.addMovie(movie);

    }
}
