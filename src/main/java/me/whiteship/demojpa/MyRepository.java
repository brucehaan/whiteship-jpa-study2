package me.whiteship.demojpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.io.Serializable;

@NoRepositoryBean // 중간에 사용되는 Repository는 붙이셈
public interface MyRepository<T, ID extends Serializable> extends JpaRepository<T, ID> {
    boolean contains(T entity);
}
