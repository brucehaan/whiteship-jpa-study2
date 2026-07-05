package me.whiteship.demojpa.post;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
public class Post {

    @Id @GeneratedValue
    private Long id;

    private String title;

    @Lob // 255자 넘을 것 같으면
    private String content;

    private Date created;

}
