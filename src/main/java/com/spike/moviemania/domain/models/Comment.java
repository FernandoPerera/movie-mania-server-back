package com.spike.moviemania.domain.models;

import java.util.UUID;

public class Comment {

    private UUID commentId;
    private String nickname;
    private String comment;
    private UUID movieId;

    public Comment(UUID commentId, String nickname, String comment,
                   UUID movieId) {
        this.commentId = commentId;
        this.nickname = nickname;
        this.comment = comment;
        this.movieId = movieId;
    }

    public Comment(String nickname, String comment, UUID movieId) {
        this.nickname = nickname;
        this.comment = comment;
        this.movieId = movieId;
    }

    public UUID getCommentId() {
        return commentId;
    }

    public void setCommentId(UUID commentId) {
        this.commentId = commentId;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public UUID getMovieId() {
        return movieId;
    }

    public void setMovieId(UUID movieId) {
        this.movieId = movieId;
    }

    public void generateId() {
        this.commentId = UUID.randomUUID();
    }
}
