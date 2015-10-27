package com.felab.security;

import com.felab.dao.DbUserDao;
import com.felab.domain.DbUser;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by Administrator on 2015/10/26 0026.
 */
public class CustomUserDetailsService implements UserDetailsService {

    private DbUserDao userDao = new DbUserDao();

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        UserDetails user = null;
        DbUser dbUser = userDao.getDatabase(s);
        user = new User(dbUser.getUserName(), dbUser.getPassword().toLowerCase(), true, true, true, true, getAuthorities(dbUser.getAccess()));
        return user;
    }

    public Collection<GrantedAuthority> getAuthorities(Integer access) {
        List<GrantedAuthority> authList = new ArrayList<GrantedAuthority>();
        authList.add(new SimpleGrantedAuthority("ROLE_USER"));
        if (access.compareTo(1) == 0) {
            authList.add(new SimpleGrantedAuthority("ROLE_ADMIN"));
        }

        return authList;
    }
}
