package me.whiteship.demojpa;

import jakarta.persistence.EntityManager;
import org.springframework.data.jpa.repository.support.JpaEntityInformation;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;

import java.io.Serializable;
import java.util.List;

public class MyRepositoryImpl<T, ID extends Serializable> extends SimpleJpaRepository<T, ID> implements MyRepository<T, ID> {

    private EntityManager em;

    public MyRepositoryImpl(JpaEntityInformation<T, ?> entityInformation, EntityManager entityManager) {
        super(entityInformation, entityManager);
    }

    @Override
    public boolean contains(T entity) {
        return em.contains(entity);
    }

    @Override
    public List<T> findAll() {
        return super.findAll();
    }
}
