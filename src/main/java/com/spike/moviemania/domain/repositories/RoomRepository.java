package com.spike.moviemania.domain.repositories;

import com.spike.moviemania.domain.models.Room;

import java.util.List;
import java.util.UUID;

public interface RoomRepository {

    void save(Room room);
    List<Room> getRoomByMovieId(UUID movieId);

}
