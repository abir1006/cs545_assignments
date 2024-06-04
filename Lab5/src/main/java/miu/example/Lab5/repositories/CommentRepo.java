package miu.example.Lab5.repositories;

import miu.example.Lab5.entities.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepo extends JpaRepository<Comment, Long> {

}
