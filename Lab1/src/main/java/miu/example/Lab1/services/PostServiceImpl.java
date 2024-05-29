package miu.example.Lab1.services;

import miu.example.Lab1.entities.Post;
import miu.example.Lab1.entities.dtos.response.PostDto;
import miu.example.Lab1.repositories.PostRepo;
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
    public List<PostDto> findAll() {
        List<Post> posts = postRepo.findAll();
        return posts.stream()
                .map(post -> modelMapper.map(post, PostDto.class))
                .collect(Collectors.toList());
    }

    @Override
    public PostDto findById(int id) {
        return modelMapper.map(postRepo.findById(id), PostDto.class);
    }

    @Override
    public PostDto save(PostDto post) {
        Post postEntity = modelMapper.map(post, Post.class);
        postEntity = postRepo.save(postEntity);
        return modelMapper.map(postEntity, PostDto.class);
    }

    @Override
    public List<Post> delete(int id) {
        return postRepo.delete(id);
    }
}
