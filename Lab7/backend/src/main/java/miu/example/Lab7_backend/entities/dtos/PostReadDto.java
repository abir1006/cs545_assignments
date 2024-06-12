package miu.example.Lab7_backend.entities.dtos;


import lombok.*;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class PostReadDto {
    private int id;
    private String title;
    private String content;
    private String author;

    private List<CommentDto> comments;
 }
