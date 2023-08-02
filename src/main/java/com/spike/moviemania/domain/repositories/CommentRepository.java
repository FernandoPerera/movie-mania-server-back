package com.spike.moviemania.domain.repositories;

import com.spike.moviemania.domain.models.Comment;

import java.util.List;
import java.util.UUID;

public interface CommentRepository {

    void save(Comment comment);
    void update(Comment comment);
    void delete(UUID commentId);
    List<Comment> getAllCommentsByMovieId(UUID movieId);
    List<Comment> getAllCommentsByUserId(UUID userId);

}
