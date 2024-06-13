package miu.example.Lab8_backend.services;

import miu.example.Lab8_backend.entities.dtos.CommentDto;

import java.util.List;

public interface CommentService {
    public List<CommentDto> findAll();
    public CommentDto findById(Long id);
    public CommentDto save(CommentDto comment);
    // public PostDto update(PostDto post);
    public void deleteById(Long id);
}
