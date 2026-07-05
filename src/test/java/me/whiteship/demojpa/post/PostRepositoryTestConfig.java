package me.whiteship.demojpa.post;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Configuration
public class PostRepositoryTestConfig {
//    @Bean
//    public PostListener postListener() {
//        return new PostListener();
//    }

    @Bean
    public ApplicationListener<PostPublishedEvent> postListener() {
        return event -> {
            log.info("---------------------");
            log.info(event.getPost().getTitle());
            log.info("---------------------");
        };
    }
}
