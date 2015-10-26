package com.felab.dao.impl;

import com.felab.dao.BaseDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

/**
 * Created by azheng on 10/23/2015.
 */
public class BaseDaoImpl<T> implements BaseDao<T> {

    @Autowired
    private HibernateTemplate hibernateTemplate;

    // 实体类的类型
    private Class entityClass;

    public BaseDaoImpl() {
        Type genType = getClass().getGenericSuperclass();
        Type[] params = ((ParameterizedType) genType).getActualTypeArguments();
        entityClass = (Class) params[0];
    }

    /**
     * 保存实体
     * @param entity 实体类
     */
    @Override
    public void save(T entity) {
        hibernateTemplate.save(entity);
    }

    /**
     * 删除实体
     * @param entity
     */
    @Override
    public void delete(T entity) {
        hibernateTemplate.delete(entity);
    }

    /**
     * 更新单个实体
     * @param entity
     */
    @Override
    public void update(T entity) {
        hibernateTemplate.update(entity);
    }

    /**
     * 查询单个实体
     * @param id
     * @return
     */
    @Override
    public T get(Serializable id) {
        return (T) hibernateTemplate.get(entityClass, id);
    }

    /**
     * 根据ID加载实体
     * @param id
     * @return
     */
    @Override
    public T load(Serializable id) {
        return (T) hibernateTemplate.load(entityClass, id);
    }

    /**
     * 加载所有实体
     * @return
     */
    @Override
    public List<T> loadAll() {
        return hibernateTemplate.loadAll(entityClass);
    }


}
