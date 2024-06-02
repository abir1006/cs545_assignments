package miu.example.Lab4.services;

import miu.example.Lab4.entities.dtos.response.CommentDto;

import java.util.List;

public interface CommentService {
    public List<CommentDto> findAll();
    public CommentDto findById(Long id);
    public CommentDto save(CommentDto comment);
    // public PostDto update(PostDto post);
    public void deleteById(Long id);
}
