package miu.example.Lab2.services;

import miu.example.Lab2.entities.Post;
import miu.example.Lab2.entities.dtos.response.PostDto;

import java.util.List;

public interface PostService {
    public List<PostDto> findAll();
    public PostDto findById(Long id);
    public PostDto save(PostDto post);
    // public PostDto update(PostDto post);
    public void delete(Post post);
}
