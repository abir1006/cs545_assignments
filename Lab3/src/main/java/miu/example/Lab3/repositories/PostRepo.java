package miu.example.Lab3.repositories;

import miu.example.Lab3.entities.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepo extends JpaRepository<Post, Long> {

}
