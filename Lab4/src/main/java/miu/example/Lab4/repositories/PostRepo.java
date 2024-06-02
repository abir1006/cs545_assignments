package miu.example.Lab4.repositories;

import miu.example.Lab4.entities.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostRepo extends JpaRepository<Post, Long> {
    List<Post> findByTitleContaining(String title);
}
