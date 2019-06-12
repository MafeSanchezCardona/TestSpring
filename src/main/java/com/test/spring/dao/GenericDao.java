package com.test.spring.dao;

import java.io.Serializable;
import java.util.List;

public interface GenericDao<T extends Serializable> {

    T find(final T entity);

    List<T> findAll();

    void insert(final T entity);

    T update(final T entity);

    void delete(final T entity);
}
