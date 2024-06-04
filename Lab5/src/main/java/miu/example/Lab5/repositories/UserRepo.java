package miu.example.Lab5.repositories;

import miu.example.Lab5.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepo extends JpaRepository<User, Long> {

    @Query("SELECT u FROM User u WHERE SIZE(u.posts) > :postCount")
    public List<User> findUserMoreThanNPost(@Param("postCount") int postCount);

    User findByEmail(String email);

}
