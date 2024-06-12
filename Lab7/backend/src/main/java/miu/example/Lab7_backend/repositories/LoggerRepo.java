package miu.example.Lab7_backend.repositories;

import miu.example.Lab7_backend.entities.Logger;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoggerRepo extends JpaRepository<Logger, Long> {
}
