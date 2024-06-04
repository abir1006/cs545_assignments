package miu.example.Lab5.repositories;

import miu.example.Lab5.entities.Logger;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoggerRepo extends JpaRepository<Logger, Long> {
}
