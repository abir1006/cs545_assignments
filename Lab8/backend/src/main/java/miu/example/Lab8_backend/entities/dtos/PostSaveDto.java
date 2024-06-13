package miu.example.Lab8_backend.entities.dtos;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class PostSaveDto {
    private int id;
    private String title;
    private String content;
    private String author;
 }
