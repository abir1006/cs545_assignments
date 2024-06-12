package miu.example.Lab7_backend.controllers;

import miu.example.Lab7_backend.entities.Comment;
import miu.example.Lab7_backend.entities.Post;
import miu.example.Lab7_backend.entities.dtos.CommentDto;
import miu.example.Lab7_backend.entities.dtos.PostReadDto;
import miu.example.Lab7_backend.entities.dtos.PostSaveDto;
import miu.example.Lab7_backend.services.CommentService;
import miu.example.Lab7_backend.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/v1/posts")
public class PostController {

    @Autowired
    private PostService postService;

    @Autowired
    private CommentService commentService;

    @GetMapping
    public List<PostReadDto> findAll() {
        return postService.findAll();
    }

    @GetMapping("/{id}/comments")
    public List<CommentDto> getCommentsByPost(@PathVariable Long id) {
        PostReadDto post = postService.findById(id);
        return post.getComments();
    }

    @GetMapping("/filter")
    public List<PostReadDto> findByTitle(@RequestParam String title) {
        return postService.findByTitle(title);
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/{id}")
    public PostReadDto findById(@PathVariable Long id) {
        return postService.findById(id);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public PostSaveDto save(@RequestBody PostSaveDto post) {
        return postService.save(post);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        System.out.println(id);
        postService.delete(id);
    }
}
