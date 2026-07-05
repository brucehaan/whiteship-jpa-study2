package me.whiteship.demojpa.post;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@Transactional
class PostRepositoryTest {
    @Autowired
    PostRepository postRepository;

    @Test
    void crud() {
        postRepository.findMyPost();

        Post post = new Post();
        post.setTitle("hibernate");
        postRepository.save(post);

        postRepository.findMyPost();

        postRepository.delete(post);
        postRepository.flush();
    }
}