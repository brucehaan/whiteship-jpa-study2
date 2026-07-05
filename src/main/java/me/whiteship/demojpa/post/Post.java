package me.whiteship.demojpa.post;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.domain.AbstractAggregateRoot;

import java.util.Date;

@Entity
@Getter
@Setter
public class Post extends AbstractAggregateRoot<Post> {

    @Id @GeneratedValue
    private Long id;

    private String title;

    @Lob // 255자 넘을 것 같으면
    private String content;

    private Date created;

    public Post publish() {
        this.registerEvent(new PostPublishedEvent(this));
        return this;
    }
}
