package miu.example.Lab4.repositories;

import miu.example.Lab4.entities.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepo extends JpaRepository<Comment, Long> {

}
