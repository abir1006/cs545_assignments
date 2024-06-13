package miu.example.Lab8_backend.repositories;

import miu.example.Lab8_backend.entities.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostRepo extends JpaRepository<Post, Long> {
    List<Post> findByTitleContaining(String title);
}
