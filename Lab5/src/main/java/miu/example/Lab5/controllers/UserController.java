package miu.example.Lab5.controllers;

import miu.example.Lab5.annotations.ExecutionTime;
import miu.example.Lab5.entities.dtos.response.PostDto;
import miu.example.Lab5.entities.dtos.response.UserDto;
import miu.example.Lab5.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public List<UserDto> findAll() {
        return userService.findAll();
    }

    @GetMapping("/more-than/{postCount}/posts")
    public List<UserDto> findUserMoreThanNPosts(@PathVariable int postCount) {
        return userService.findUserMoreThanNPost(postCount);
    }


    @ResponseStatus(HttpStatus.OK)
    @ExecutionTime
    @GetMapping("/{id}")
    public UserDto findById(@PathVariable Long id) {
        return userService.findById(id);
    }

    @GetMapping("/{id}/posts")
    public List<PostDto> findPostsByUserId(@PathVariable Long id) {
        return userService.findPostByUserId(id);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public UserDto save(@RequestBody UserDto user) {
        return userService.save(user);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        userService.deleteById(id);
    }
}
