package me.whiteship.demojpa.post;

import me.whiteship.demojpa.MyRepository;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends MyRepository<Post, Long> {

}
