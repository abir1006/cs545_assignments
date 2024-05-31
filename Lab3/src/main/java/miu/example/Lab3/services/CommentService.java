package miu.example.Lab3.services;

import miu.example.Lab3.entities.Comment;
import miu.example.Lab3.entities.dtos.response.CommentDto;
import miu.example.Lab3.entities.dtos.response.PostDto;

import java.util.List;

public interface CommentService {
    public List<CommentDto> findAll();
    public CommentDto findById(Long id);
    public CommentDto save(CommentDto comment);
    // public PostDto update(PostDto post);
    public void deleteById(Long id);
}
