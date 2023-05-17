package com.spike.moviemania.domain.repositories;

import com.spike.moviemania.domain.models.Category;

import java.util.List;

public interface CategoryRepository {

    void save(Category category);

    List<Category> getAllCategories();

}
