package com.spike.moviemania.domain.models;

import java.util.UUID;

public class Comment {

    private UUID commentId;
    private String comment;
    private User user;
    private Movie movie;

    public Comment(String comment, User user, Movie movie) {
        this.comment = comment;
        this.user = user;
        this.movie = movie;
    }

    public UUID getCommentId() {
        return commentId;
    }

    public void setCommentId(UUID commentId) {
        this.commentId = commentId;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }
}
