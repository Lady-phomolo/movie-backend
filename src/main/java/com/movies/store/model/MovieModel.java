/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.movies.store.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * @author phomolo
 */
public class MovieModel {
      
    @JsonProperty("movie_id")
    private Long movieId;

    @JsonProperty("movie_title")
    private String movieTitle;

    @JsonProperty("movie_category")
    private String movieCategory;

    @JsonProperty("movie_status")
    private String movieStatus;

    public Long getMovieId() {
        return movieId;
    }

    public void setMovieId(Long movieId) {
        this.movieId = movieId;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    public String getMovieCategory() {
        return movieCategory;
    }

    public void setMovieCategory(String movieCategory) {
        this.movieCategory = movieCategory;
    }

    public String getMovieStatus() {
        return movieStatus;
    }

    public void setMovieStatus(String movieStatus) {
        this.movieStatus = movieStatus;
    }

    public MovieModel(String movieTitle, String movieCategory, String movieStatus) {
        this.movieTitle = movieTitle;
        this.movieCategory = movieCategory;
        this.movieStatus = movieStatus;
    }

    public MovieModel() {
    }

    @Override
    public String toString() {
        return "Movie{" + "movieId=" + movieId
                + ", movieTitle=" + movieTitle
                + ", movieCategory=" + movieCategory
                + ", movieStatus=" + movieStatus + '}';
    }

}
