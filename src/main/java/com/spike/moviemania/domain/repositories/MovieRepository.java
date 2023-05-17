package com.spike.moviemania.domain.repositories;

import com.spike.moviemania.domain.models.Movie;

import java.util.List;
import java.util.UUID;

public interface MovieRepository {

    void save(Movie movie);

    List<Movie> getAllMovies();

    List<Movie> getAllMoviesByName(String movieName);

    Movie getMovieById(UUID movieId);

}
