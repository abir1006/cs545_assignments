package miu.example.Lab7_backend.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/admin")
public class AdminController {


    @GetMapping
    public String index() {
        return "Welcome to the Admin Page";
    }
}
