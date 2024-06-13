package miu.example.Lab8_backend.services;

import miu.example.Lab8_backend.entities.dtos.PostReadDto;
import miu.example.Lab8_backend.entities.dtos.PostSaveDto;

import java.util.List;

public interface PostService {
    public List<PostReadDto> findAll();
    public List<PostReadDto> findByTitle(String title);
    public PostReadDto findById(Long id);
    public PostSaveDto save(PostSaveDto post);
    // public PostDto update(PostDto post);
    public void delete(Long id);
}
