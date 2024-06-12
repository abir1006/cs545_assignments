package miu.example.Lab7_backend.services;

import miu.example.Lab7_backend.entities.Comment;
import miu.example.Lab7_backend.entities.Post;
import miu.example.Lab7_backend.entities.dtos.CommentDto;

import java.util.List;

public interface CommentService {
    public List<CommentDto> findAll();
    public CommentDto findById(Long id);
    public CommentDto save(CommentDto comment);
    // public PostDto update(PostDto post);
    public void deleteById(Long id);
}
