package com.felab.dao;

import com.felab.domain.User;
import com.felab.repository.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

/**
 * Created by azheng on 10/23/2015.
 */
@RunWith(BlockJUnit4ClassRunner.class)
public class DaoTest extends UnitTestBase {

    public DaoTest() {
        super("C:\\Users\\azheng\\IdeaProjects\\andy_app\\src\\main\\resources\\spring-data-jpa.xml");
    }

    @Test
    public void testRegister() {
        User user = new User();
        user.setUsername("zz360475097");
        user.setNickName("郑敏");
        user.setEmail("360475097@qq.com");
        user.setPassword("zz7366231");
        UserRepository repository = (UserRepository) getBean(UserRepository.class);
        repository.save(user);
    }

    @Test
    public void testUpdate() {
//        User user = new User();
//        user.setUserId(1);
//        user.setUserName("yaoying");
//        UserService userService = (UserService) getBean("userServiceImpl");
//        userService.update(user);
    }

    @Test
    public void testDelete() {
//        UserService userService = (UserService) getBean("userServiceImpl");
//        userService.delete(1);
    }

    @Test
    public void testFind() {
//        User user = new User();
//        user.setUserName("zz360475097");
//        user.setNickName("zhengmin");
//        user.setEmail("360475097@qq.com");
//        user.setPassword("zz7366231");
//        user.setSex(1);
//        user.setIntroduction("sss");
//        UserService userService = (UserService) getBean("userServiceImpl");
//        User findUser = userService.find(2);
    }
}
