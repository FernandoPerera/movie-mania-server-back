package com.spike.moviemania.domain.repositories;

import com.spike.moviemania.domain.models.RoomInformation;

import java.util.List;
import java.util.UUID;

public interface RoomInformationRepository {

    void save(RoomInformation roomInformation);

    List<RoomInformation> getAllRoomInformationByMovieId(UUID movieId);

}
