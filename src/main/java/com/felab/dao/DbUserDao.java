package com.felab.dao;

import com.felab.domain.DbUser;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2015/10/26 0026.
 */
public class DbUserDao {

    public DbUser getDatabase(String userName) {
        List<DbUser> users = initialDatabase();
        for (DbUser dbUser : users) {
            if (dbUser.getUserName().equals(userName)) {
                return dbUser;
            }
        }
        throw new RuntimeException("User does not exist!");
    }

    private List<DbUser> initialDatabase() {
        List<DbUser> users = new ArrayList<DbUser>();
        DbUser user = new DbUser();
        user.setUserName("admin");

        // "admin"经过MD5加密后
        user.setPassword("21232f297a57a5a743894a0e4a801fc3");
        user.setAccess(1);

        users.add(user);

        user = new DbUser();
        user.setUserName("user");

        // "user"经过MD5加密后
        user.setPassword("ee11cbb19052e40b07aac0ca060c23ee");
        user.setAccess(2);

        users.add(user);
        return users;
    }
}
