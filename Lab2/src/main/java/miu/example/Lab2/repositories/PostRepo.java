package miu.example.Lab2.repositories;

import miu.example.Lab2.entities.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepo extends JpaRepository<Post, Long> {

}
