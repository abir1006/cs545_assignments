package miu.example.Lab2.controllers;

import miu.example.Lab2.entities.Post;
import miu.example.Lab2.entities.dtos.response.PostDto;
import miu.example.Lab2.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/posts")
public class PostController {

    @Autowired
    private PostService postService;

    @GetMapping
    public List<PostDto> findAll() {
        return postService.findAll();
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/{id}")
    public PostDto findById(@PathVariable Long id) {
        return postService.findById(id);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public PostDto save(@RequestBody PostDto post) {
        return postService.save(post);
    }

    @DeleteMapping
    public void delete(@RequestBody Post post) {
        postService.delete(post);
    }
}
