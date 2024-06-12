package miu.example.Lab7_backend.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(name = "logger")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Logger {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long transaction_id;

    @CreationTimestamp
    private LocalDateTime created_at;
    private String principle;
    private String operation;
}
