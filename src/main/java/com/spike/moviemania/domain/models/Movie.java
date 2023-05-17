package com.spike.moviemania.domain.models;

import java.io.File;
import java.util.Date;
import java.util.UUID;

public class Movie {

    private UUID movieId;
    private String name;
    private String production;
    private Date releaseDate;
    private String description;
    private UUID categoryId;
    private File image;

    public Movie(UUID movieId, String name, String production,
                 Date releaseDate, String description, UUID categoryId, File image) {
        this.movieId = movieId;
        this.name = name;
        this.production = production;
        this.releaseDate = releaseDate;
        this.description = description;
        this.categoryId = categoryId;
        this.image = image;
    }

    public Movie(String name, String production, Date releaseDate,
                 String description, UUID categoryId, File image) {
        this.name = name;
        this.production = production;
        this.releaseDate = releaseDate;
        this.description = description;
        this.categoryId = categoryId;
        this.image = image;
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

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UUID getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(UUID categoryId) {
        this.categoryId = categoryId;
    }

    public File getImage() {
        return image;
    }

    public void setImage(File image) {
        this.image = image;
    }

    public void generateId() {
        this.movieId = UUID.randomUUID();
    }

}
