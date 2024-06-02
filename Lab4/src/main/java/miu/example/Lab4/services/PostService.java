package miu.example.Lab4.services;

import miu.example.Lab4.entities.Post;
import miu.example.Lab4.entities.dtos.response.PostDto;

import java.util.List;

public interface PostService {
    public List<PostDto> findAll();
    public List<PostDto> findByTitle(String title);
    public PostDto findById(Long id);
    public PostDto save(PostDto post);
    // public PostDto update(PostDto post);
    public void delete(Post post);
}
