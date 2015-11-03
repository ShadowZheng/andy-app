package com.felab.security;

import com.felab.dao.UserDao;
import com.felab.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.security.authentication.dao.SaltSource;
import org.springframework.security.authentication.encoding.PasswordEncoder;
import org.springframework.security.core.userdetails.UserDetails;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by azheng on 11/3/2015.
 */
public class DatabasePasswordSecureBean extends JdbcDaoSupport {

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private UserService userService;

    @Autowired
    private SaltSource saltSource;

    @Autowired
    private UserDao userDao;

    public void secureDatabase() {
        getJdbcTemplate().query("select USER_NAME,PASSWORD from T_USER", new RowCallbackHandler() {
            @Override
            public void processRow(ResultSet resultSet) throws SQLException {
                String userName = resultSet.getString(1);
                String password = resultSet.getString(2);
                UserDetails user = userService.loadUserByUsername(userName);
                String encodePassword = passwordEncoder.encodePassword(password, saltSource.getSalt(user));
                userDao.changePassword(userName, encodePassword);
            }
        });
    }
}
