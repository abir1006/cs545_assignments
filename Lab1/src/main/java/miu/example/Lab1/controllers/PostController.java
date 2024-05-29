package miu.example.Lab1.controllers;

import miu.example.Lab1.entities.Post;
import miu.example.Lab1.entities.dtos.response.PostDto;
import miu.example.Lab1.services.PostService;
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
    public PostDto findById(@PathVariable int id) {
        return postService.findById(id);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public Post save(@RequestBody Post post) {
        return postService.save(post);
    }

    @DeleteMapping("/{id}")
    public List<Post> delete(@PathVariable int id) {
        return postService.delete(id);
    }
}
