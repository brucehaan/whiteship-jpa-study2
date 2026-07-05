package me.whiteship.demojpa;

import jakarta.persistence.EntityManager;
import org.springframework.data.jpa.repository.support.JpaEntityInformation;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;

import java.io.Serializable;

public class MyRepositoryImpl<T, ID extends Serializable> extends SimpleJpaRepository<T, ID> implements MyRepository<T, ID> {

    private EntityManager em;

    public MyRepositoryImpl(JpaEntityInformation<T, ID> entityInformation, EntityManager em) {
        super(entityInformation, em);
        this.em = em;
    }

    @Override
    public boolean contains(T entity) {
        return em.contains(entity);
    }

}
