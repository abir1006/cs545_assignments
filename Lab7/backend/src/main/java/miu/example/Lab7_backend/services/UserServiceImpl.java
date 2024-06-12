package miu.example.Lab7_backend.services;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import miu.example.Lab7_backend.entities.User;
import miu.example.Lab7_backend.entities.dtos.PostReadDto;
import miu.example.Lab7_backend.entities.dtos.UserDto;
import miu.example.Lab7_backend.repositories.UserRepo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private EntityManager entityManager;

    @Override
    public List<UserDto> findAll() {
        List<User> users = userRepo.findAll();
        return users.stream()
                .map(user -> modelMapper.map(user, UserDto.class))
                .collect(Collectors.toList());
    }

    @Override
    public List<UserDto> findUserMoreThanNPost(int postCount) {
        List<User> users = userRepo.findUserMoreThanNPost(postCount);
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
    public void deleteById(Long id) {
        userRepo.deleteById(id);
    }

    @Override
    public List<PostReadDto> findPostByUserId(Long userId) {
        User user = userRepo.findById(userId).orElseThrow( () -> new RuntimeException("User not found") );
        return user.getPosts()
                .stream()
                .map(post -> modelMapper.map(post, PostReadDto.class))
                .collect(Collectors.toList());
    }
}
