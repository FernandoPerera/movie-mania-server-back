package com.spike.moviemania.domain.repositories;

import com.spike.moviemania.domain.models.User;

import java.util.UUID;

public interface UserRepository {

    void save(User user);
    void update(User user);
    void getUserById(UUID userId);

}
