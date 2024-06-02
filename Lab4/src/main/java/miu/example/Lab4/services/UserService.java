package miu.example.Lab4.services;


import miu.example.Lab4.entities.dtos.response.PostDto;
import miu.example.Lab4.entities.dtos.response.UserDto;

import java.util.List;

public interface UserService {
    public List<UserDto> findAll();
    public List<UserDto> findUserMoreThanNPost(int postCount);
    public UserDto findById(Long id);
    public UserDto save(UserDto user);
    // public PostDto update(PostDto post);
    public void deleteById(Long id);
    public List<PostDto> findPostByUserId(Long userId);

}
