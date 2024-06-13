package miu.example.Lab8_backend.repositories;

import miu.example.Lab8_backend.entities.Logger;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoggerRepo extends JpaRepository<Logger, Long> {
}
