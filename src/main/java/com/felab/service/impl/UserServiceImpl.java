package com.felab.service.impl;

import com.felab.dao.UserDao;
import com.felab.entity.User;
import com.felab.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by azheng on 10/23/2015.
 */
@Transactional
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDao userDao;

    @Override
    public void register(User user) {
        userDao.save(user);
    }

    @Override
    public void delete(int id) {
        User user = new User();
        user.setUserId(id);
        userDao.delete(user);
    }

    @Override
    public void update(User user) {
        userDao.update(user);
    }

    @Override
    public User find(int id) {
        return userDao.get(id);
    }
}
