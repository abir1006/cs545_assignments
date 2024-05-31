package miu.example.Lab3.repositories;

import miu.example.Lab3.entities.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepo extends JpaRepository<Comment, Long> {

}
