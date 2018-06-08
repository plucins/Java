package dao;

import java.io.Serializable;
import java.util.List;

public interface AbstractDAO<T, Id extends Serializable> {
    T findByID(Long id);
    List<T> findAll();
    void remove(T entity);
    void update(T entity);
    void add(T entity);
}
