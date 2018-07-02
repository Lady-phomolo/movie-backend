/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.movies.store.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author phomolo
 */
@Entity
@Table(name = "movie")
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="movie_id")
    private Long movieId;

    @Column(name="movie_title")
    private String movieTitle;

    @Column(name="movie_category")
    private String movieCategory;

    @Column(name="movie_status")
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

    public Movie(String movieTitle, String movieCategory, String movieStatus) {
        this.movieTitle = movieTitle;
        this.movieCategory = movieCategory;
        this.movieStatus = movieStatus;
    }

    public Movie() {
    }

    @Override
    public String toString() {
        return "Movie{" + "movieId=" + movieId
                + ", movieTitle=" + movieTitle
                + ", movieCategory=" + movieCategory
                + ", movieStatus=" + movieStatus + '}';
    }

}

