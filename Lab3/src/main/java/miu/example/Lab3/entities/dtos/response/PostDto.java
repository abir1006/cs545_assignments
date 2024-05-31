package miu.example.Lab3.entities.dtos.response;


import lombok.*;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class PostDto {
    private int id;
    private String title;
    private String content;
    private String author;

    private List<CommentDto> comments;
 }
