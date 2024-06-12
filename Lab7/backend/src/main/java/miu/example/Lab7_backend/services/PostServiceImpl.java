package miu.example.Lab7_backend.services;

import miu.example.Lab7_backend.entities.Post;
import miu.example.Lab7_backend.entities.dtos.PostReadDto;
import miu.example.Lab7_backend.entities.dtos.PostSaveDto;
import miu.example.Lab7_backend.repositories.PostRepo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PostServiceImpl implements PostService {

    @Autowired
    private PostRepo postRepo;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public List<PostReadDto> findAll() {
        List<Post> posts = postRepo.findAll();
        return posts.stream()
                .map(post -> modelMapper.map(post, PostReadDto.class))
                .collect(Collectors.toList());
    }

    @Override
    public List<PostReadDto> findByTitle(String title) {
        List<Post> posts = postRepo.findByTitleContaining(title);
        return posts.stream()
                .map(post -> modelMapper.map(post, PostReadDto.class))
                .collect(Collectors.toList());
    }

    @Override
    public PostReadDto findById(Long id) {
        return modelMapper.map(postRepo.findById(id), PostReadDto.class);
    }

    @Override
    public PostSaveDto save(PostSaveDto post) {
        Post postEntity = modelMapper.map(post, Post.class);
        postEntity = postRepo.save(postEntity);
        return modelMapper.map(postEntity, PostSaveDto.class);
    }

    @Override
    public void delete(Long id) {
        postRepo.deleteById(id);
    }
}
