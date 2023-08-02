package com.spike.moviemania.domain.repositories;

import com.spike.moviemania.domain.models.Schedule;

import java.util.List;
import java.util.UUID;

public interface ScheduleRepository {

    void save(Schedule schedule);
    void update(Schedule schedule);
    void delete(UUID scheduleId);
    List<Schedule> getSchedulesByMovieId(UUID movieId);
}
