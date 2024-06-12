package miu.example.Lab7_backend.repositories;

import miu.example.Lab7_backend.entities.Comment;
import miu.example.Lab7_backend.entities.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentRepo extends JpaRepository<Comment, Long> {
}
