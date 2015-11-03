package com.felab.service.impl;

import com.felab.dao.UserDao;
import com.felab.domain.User;
import com.felab.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.encoding.PasswordEncoder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by azheng on 10/23/2015.
 */
@Transactional
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private UserDao userDao;

    @Override
    public void register(User user) {
        userDao.add(user);
    }

    @Override
    public void delete(int id) {
        userDao.delete(id);
    }

    @Override
    public void update(User user) {
        userDao.update(user);
    }

    @Override
    public User find(int id) {
        return userDao.findById(id);
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return userDao.findByUsername(username);
    }

    @Override
    public void changePassword(String username, String newPassword) {
        User user = (User) loadUserByUsername(username);
        String encodePassword = passwordEncoder.encodePassword(newPassword, user.getSalt());
        userDao.changePassword(username, encodePassword);
    }
}
