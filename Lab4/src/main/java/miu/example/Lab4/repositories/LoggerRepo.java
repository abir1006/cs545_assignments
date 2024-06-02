package miu.example.Lab4.repositories;

import miu.example.Lab4.entities.Logger;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoggerRepo extends JpaRepository<Logger, Long> {
}
