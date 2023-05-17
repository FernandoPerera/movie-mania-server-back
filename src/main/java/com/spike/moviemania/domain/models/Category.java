package com.spike.moviemania.domain.models;

import java.util.UUID;

public class Category {

    private UUID categoryId;
    private String name;

    public Category(UUID categoryId, String name) {
        this.categoryId = categoryId;
        this.name = name;
    }

    public Category(String name) {
        this.name = name;
    }

    public UUID getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(UUID categoryId) {
        this.categoryId = categoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void generateId() {
        this.categoryId = UUID.randomUUID();
    }

}
