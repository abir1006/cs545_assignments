package miu.example.Lab5.entities.dtos.response;


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
    private List<PostDto> posts;
    private int postsCount;
}
