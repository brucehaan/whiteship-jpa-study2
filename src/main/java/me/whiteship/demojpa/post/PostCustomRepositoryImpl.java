package me.whiteship.demojpa.post;

import jakarta.persistence.EntityManager;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Slf4j
@Repository
@Transactional
public class PostCustomRepositoryImpl implements PostCustomRepository<Post> {
    @Autowired
    EntityManager em;

    @Override
    public List<Post> findMyPost() {
        log.info("custom findMyPost");
        return em.createQuery("select p from Post as p", Post.class).getResultList();
    }

    @Override
    public void delete(Post entity) {
        log.info("custom delete");
        em.remove(entity);
    }
}
