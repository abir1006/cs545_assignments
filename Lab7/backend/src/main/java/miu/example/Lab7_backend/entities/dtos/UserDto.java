package miu.example.Lab7_backend.entities.dtos;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class UserDto {
    private int id;
    private String name;
    private List<PostReadDto> posts;
    private int postsCount;
}
