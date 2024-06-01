package miu.example.Lab3.repositories;

import miu.example.Lab3.entities.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostRepo extends JpaRepository<Post, Long> {
    List<Post> findByTitleContaining(String title);
}
