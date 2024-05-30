package miu.example.Lab2.repositories;

import miu.example.Lab2.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {

}
