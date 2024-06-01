package miu.example.Lab3.controllers;

import miu.example.Lab3.entities.Post;
import miu.example.Lab3.entities.dtos.response.PostDto;
import miu.example.Lab3.services.PostService;
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

    @GetMapping("/filter")
    public List<PostDto> findByTitle(@RequestParam String title) {
        return postService.findByTitle(title);
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
