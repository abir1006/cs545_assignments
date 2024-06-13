package miu.example.Lab8_backend.services;


import miu.example.Lab8_backend.entities.dtos.PostReadDto;
import miu.example.Lab8_backend.entities.dtos.UserDto;

import java.util.List;

public interface UserService {
    public List<UserDto> findAll();
    public List<UserDto> findUserMoreThanNPost(int postCount);
    public UserDto findById(Long id);
    public UserDto save(UserDto user);
    // public PostDto update(PostDto post);
    public void deleteById(Long id);
    public List<PostReadDto> findPostByUserId(Long userId);

}
