package miu.example.Lab8_backend.services;

import miu.example.Lab8_backend.entities.Comment;
import miu.example.Lab8_backend.entities.dtos.CommentDto;
import miu.example.Lab8_backend.repositories.CommentRepo;
import miu.example.Lab8_backend.repositories.PostRepo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CommentServiceImpl implements CommentService {

    @Autowired
    private CommentRepo commentRepo;

    @Autowired
    private ModelMapper modelMapper;
    @Autowired
    private PostRepo postRepo;

    @Override
    public List<CommentDto> findAll() {
        List<Comment> comments = commentRepo.findAll();
        return comments.stream()
                .map(comment -> modelMapper.map(comment, CommentDto.class))
                .collect(Collectors.toList());
    }

    @Override
    public CommentDto findById(Long id) {
        Comment comment = commentRepo.findById(id).orElseThrow(() -> new RuntimeException("Comment not found"));
        return modelMapper.map(comment, CommentDto.class);
    }

    @Override
    public CommentDto save(CommentDto comment) {
        Comment newComment = modelMapper.map(comment, Comment.class);
        newComment = commentRepo.save(newComment);
        return modelMapper.map(newComment, CommentDto.class);
    }

    @Override
    public void deleteById(Long id) {
        commentRepo.deleteById(id);
    }
}
