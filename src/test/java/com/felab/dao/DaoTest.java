package com.felab.dao;

import com.felab.domain.User;
import com.felab.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import java.util.List;

/**
 * Created by azheng on 10/23/2015.
 */
@RunWith(BlockJUnit4ClassRunner.class)
public class DaoTest extends UnitTestBase {

    public DaoTest() {
        super("classpath:spring-dao.xml");
    }

    @Test
    public void testRegister() {
        User user = new User();
        user.setUsername("zz3604750975");
        user.setNickname("郑敏5");
        user.setEmail("3604750975@qq.com");
        user.setPassword("zz7366231");
        user.setRole("ROLE_USER");
        UserService userService = (UserService) getBean(UserService.class);
        userService.register(user);
    }

    @Test
    public void testUpdate() {
        UserService service = (UserService) getBean(UserService.class);
        User user = service.find(3);
        user.setUsername("zhengmin");
        service.update(user);
    }

    @Test
    public void testDelete() {
        UserService userService = (UserService) getBean(UserService.class);
        userService.delete(1);
    }

    @Test
    public void testFind() {
        UserDao userDao = (UserDao) getBean(UserDao.class);
        User user = userDao.findById(1);
        System.out.println(user);
    }

    @Test
    public void testFindAll() {
        UserDao userDao = (UserDao) getBean(UserDao.class);
        List<User> users = userDao.findAll();
        System.out.println(users);
    }
}
