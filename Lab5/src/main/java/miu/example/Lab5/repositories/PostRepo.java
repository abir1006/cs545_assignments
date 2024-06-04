package miu.example.Lab5.repositories;

import miu.example.Lab5.entities.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostRepo extends JpaRepository<Post, Long> {
    List<Post> findByTitleContaining(String title);
}
