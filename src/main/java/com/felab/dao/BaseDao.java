package com.felab.dao;

import java.io.Serializable;

/**
 * Created by azheng on 10/30/2015.
 */
public interface BaseDao<T> {

    // 增加
    void add(T entity);

    // 删除
    void delete(Serializable id);

    // 修改
    void update(T entity);

    // 根据ID查询
    void findById(Serializable id);
}
