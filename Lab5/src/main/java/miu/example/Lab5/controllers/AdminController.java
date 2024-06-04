package miu.example.Lab5.controllers;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/admin")
public class AdminController {


    @GetMapping
    public String index() {
        return "Welcome to the Admin Page";
    }
}
