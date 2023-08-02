package com.spike.moviemania.domain;

import java.io.File;
import java.util.Calendar;
import java.util.UUID;

public class Movie {

    private UUID movieId;
    private String name;
    private String production;
    private String description;
    private Calendar releaseDate;
    private Category category;

    public Movie(String name, String production, String description, Calendar releaseDate, Category category) {
        this.name = name;
        this.production = production;
        this.description = description;
        this.releaseDate = releaseDate;
        this.category = category;
    }

    public UUID getMovieId() {
        return movieId;
    }

    public void setMovieId(UUID movieId) {
        this.movieId = movieId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProduction() {
        return production;
    }

    public void setProduction(String production) {
        this.production = production;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Calendar getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Calendar releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
