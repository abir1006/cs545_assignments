package miu.example.Lab1.repositories;

import miu.example.Lab1.entities.Post;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PostRepoImpl implements PostRepo {
    private static List<Post> posts;

    static {
        posts = new ArrayList<>();

        Post post1 = new Post(
                1,
                "How spring Boot made easier to learn Spring Framework",
                "How spring Boot made easier to learn Spring Framework",
                "John Smith"
        );

        Post post2 = new Post(
                2,
                "Sports is good for health",
                "Everyone knows that Sports is good for health",
                "Mike Smith"
        );

        Post post3 = new Post(
                3,
                "How to do good in business",
                "It is time to know how to do good in business, focus on plan and be successful",
                "Michale Jordan"
        );

        posts.add(post1);
        posts.add(post2);
        posts.add(post3);
    }

    int productID = posts.size() + 1;

    @Override
    public List<Post> findAll() {
        return posts;
    }

    @Override
    public Post save(Post post) {
        post.setId(productID);
        posts.add(post);
        return post;
    }

    @Override
    public List<Post> delete(int id) {
        var post = posts.stream()
                .filter(p -> p.getId() == id)
                .findFirst();
        posts.remove(post);

        return posts;
    }

    @Override
    public Post findById(int id) {
        return posts.stream()
                .filter(post->post.getId() == id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public void update(int id, Post post) {

    }
}
