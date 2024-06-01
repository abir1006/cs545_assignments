package miu.example.Lab3.services;

import miu.example.Lab3.entities.Post;
import miu.example.Lab3.entities.dtos.response.PostDto;

import java.util.List;

public interface PostService {
    public List<PostDto> findAll();
    public List<PostDto> findByTitle(String title);
    public PostDto findById(Long id);
    public PostDto save(PostDto post);
    public PostDto update(Long id, Post post);
    public void delete(Post post);
}
