package com.spike.moviemania.domain;

import java.sql.Time;
import java.util.UUID;

public class Schedule {

    private UUID scheduleId;
    private Time hour;
    private Movie movie;
    private Room room;

    public Schedule(Time hour, Movie movie, Room room) {
        this.hour = hour;
        this.movie = movie;
        this.room = room;
    }

    public UUID getScheduleId() {
        return scheduleId;
    }

    public void setScheduleId(UUID scheduleId) {
        this.scheduleId = scheduleId;
    }

    public Time getHour() {
        return hour;
    }

    public void setHour(Time hour) {
        this.hour = hour;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }
}
