package miu.example.Lab8_backend.repositories;

import miu.example.Lab8_backend.entities.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepo extends JpaRepository<Comment, Long> {
}
