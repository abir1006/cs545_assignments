package miu.example.Lab2.services;

import miu.example.Lab2.entities.User;
import miu.example.Lab2.entities.dtos.response.PostDto;
import miu.example.Lab2.entities.dtos.response.UserDto;
import miu.example.Lab2.repositories.UserRepo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public List<UserDto> findAll() {
        List<User> users = userRepo.findAll();
        return users.stream()
                .map(user -> modelMapper.map(user, UserDto.class))
                .collect(Collectors.toList());
    }

    @Override
    public UserDto findById(Long id) {
        return modelMapper.map(userRepo.findById(id), UserDto.class);
    }

    @Override
    public UserDto save(UserDto user) {
        User userEntity = modelMapper.map(user, User.class);
        userEntity = userRepo.save(userEntity);
        return modelMapper.map(userEntity, UserDto.class);
    }

    @Override
    public void delete(User user) {
        userRepo.delete(user);
    }

    @Override
    public List<PostDto> findPostByUserId(Long userId) {
        User user = userRepo.findById(userId).orElseThrow( () -> new RuntimeException("User not found") );
        return user.getPosts()
                .stream()
                .map(post -> modelMapper.map(post, PostDto.class))
                .collect(Collectors.toList());
    }
}
