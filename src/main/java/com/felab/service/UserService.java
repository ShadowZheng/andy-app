package com.felab.service;

import com.felab.entity.User;

/**
 * Created by azheng on 10/23/2015.
 */
public interface UserService {

    void register(User user);

    void delete(int id);

    void update(User user);

    User find(int id);
}
