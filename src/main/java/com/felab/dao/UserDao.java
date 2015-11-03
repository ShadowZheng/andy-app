package com.felab.dao;

import com.felab.domain.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by azheng on 10/23/2015.
 */
public interface UserDao {

    // 保存
    void add(User user);

    // 删除
    void delete(int userId);

    // 修改
    void update(User user);

    // 通过Id查询
    User findById(int userId);

    // 通过用户名查询用户
    User findByUsername(String userName);

    // 更改密码
    void changePassword(@Param("username") String username,@Param("password") String newPassword);

    // 查询所有
    List<User> findAll();
}
