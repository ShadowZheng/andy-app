package com.felab.dao;

import java.io.Serializable;
import java.util.List;

/**
 * Created by azheng on 10/23/2015.
 */
public interface BaseDao<T> {

    void save(T entity);

    void delete(T entity);

    void update(T entity);

    T get(Serializable id);

    T load(Serializable id);

    List<T> loadAll();
}
