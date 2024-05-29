package miu.example.Lab1.services;

import miu.example.Lab1.entities.Post;
import miu.example.Lab1.entities.dtos.response.PostDto;

import java.util.List;

public interface PostService {
    public List<PostDto> findAll();
    public PostDto findById(int id);
    public Post save(Post post);
    public List<Post> delete(int id);
}
