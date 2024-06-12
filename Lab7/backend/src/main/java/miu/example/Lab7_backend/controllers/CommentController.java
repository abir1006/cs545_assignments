package miu.example.Lab7_backend.controllers;

import miu.example.Lab7_backend.entities.dtos.CommentDto;
import miu.example.Lab7_backend.services.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/comments")
public class CommentController {

    @Autowired
    private CommentService commentService;

    @GetMapping
    public List<CommentDto> findAll() {
        return commentService.findAll();
    }

    @GetMapping("/{id}")
    public CommentDto findById(@PathVariable Long id) {
        return commentService.findById(id);
    }
}
