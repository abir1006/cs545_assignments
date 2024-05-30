package miu.example.Lab2.entities.dtos.response;


import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class PostDto {
    private int id;
    private String title;
    private String content;
    private String author;
}
