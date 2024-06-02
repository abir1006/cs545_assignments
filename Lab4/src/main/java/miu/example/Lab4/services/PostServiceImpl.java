package miu.example.Lab4.services;

import miu.example.Lab4.entities.Post;
import miu.example.Lab4.entities.dtos.response.PostDto;
import miu.example.Lab4.repositories.PostRepo;
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
    public List<PostDto> findByTitle(String title) {
        List<Post> posts = postRepo.findByTitleContaining(title);
        return posts.stream()
                .map(post -> modelMapper.map(post, PostDto.class))
                .collect(Collectors.toList());
    }

    @Override
    public PostDto findById(Long id) {
        return modelMapper.map(postRepo.findById(id), PostDto.class);
    }

    @Override
    public PostDto save(PostDto post) {
        Post postEntity = modelMapper.map(post, Post.class);
        postEntity = postRepo.save(postEntity);
        return modelMapper.map(postEntity, PostDto.class);
    }

    @Override
    public void delete(Post post) {
        postRepo.delete(post);
    }
}
