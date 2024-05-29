package miu.example.Lab1.repositories;

import miu.example.Lab1.entities.Post;

import java.util.List;

public interface PostRepo {
    public List<Post> findAll();
    public Post save(Post post);
    public List<Post> delete(int id);
    public Post findById(int id);
    //public void update(int id, Post post);
}
