package com.spike.moviemania.domain.models;

import java.util.Calendar;
import java.util.UUID;

public class RoomInformation {

    private UUID roomInformationId;
    private Calendar hour;
    private int roomNumber;
    private UUID movieId;

    public RoomInformation(UUID roomInformationId, Calendar hour, int roomNumber,
                           UUID movieId) {
        this.roomInformationId = roomInformationId;
        this.hour = hour;
        this.roomNumber = roomNumber;
        this.movieId = movieId;
    }

    public RoomInformation(Calendar hour, int roomNumber, UUID movieId) {
        this.hour = hour;
        this.roomNumber = roomNumber;
        this.movieId = movieId;
    }

    public UUID getRoomInformationId() {
        return roomInformationId;
    }

    public void setRoomInformationId(UUID roomInformationId) {
        this.roomInformationId = roomInformationId;
    }

    public Calendar getHour() {
        return hour;
    }

    public void setHour(Calendar hour) {
        this.hour = hour;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public UUID getMovieId() {
        return movieId;
    }

    public void setMovieId(UUID movieId) {
        this.movieId = movieId;
    }

    public void generateId() {
        this.roomInformationId = UUID.randomUUID();
    }
}
