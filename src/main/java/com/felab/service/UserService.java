package com.felab.service;

import com.felab.domain.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

/**
 * Created by azheng on 10/23/2015.
 */
public interface UserService extends UserDetailsService {

    void register(User user);

    void delete(int id);

    void update(User user);

    User find(int id);

    UserDetails loadUserByUsername(String username) throws UsernameNotFoundException;

    void changePassword(String username, String newPassword);

}
