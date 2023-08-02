package com.spike.moviemania.domain.repositories;

import com.spike.moviemania.domain.models.Category;

import java.util.List;
import java.util.UUID;

public interface CategoryRepository {

    void save(Category category);
    void update(Category category);
    void delete(UUID categoryId);
    List<Category> getAllCategories();

}
