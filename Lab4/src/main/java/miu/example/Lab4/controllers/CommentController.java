package miu.example.Lab4.controllers;

import miu.example.Lab4.entities.dtos.response.CommentDto;
import miu.example.Lab4.services.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/comments")
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
