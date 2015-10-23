package com.felab.dao;

import org.junit.After;
import org.junit.Before;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.StringUtils;

/**
 * Created by azheng on 10/19/2015.
 */
public class UnitTestBase {

    private ClassPathXmlApplicationContext context;

    private String path;

    public UnitTestBase(String path) {
        this.path = path;
    }

    public UnitTestBase() {
    }

    @Before
    public void setUp() {
        if (StringUtils.isEmpty(path)) {
            path = "classpath*:spring-*.xml";
        }
        context = new ClassPathXmlApplicationContext(path);
        context.start();
    }

    @After
    public void destroy() {
        context.destroy();
    }

    public Object getBean(String id) {
        return context.getBean(id);
    }
}
