package com.zhr.spring.test;

import com.zhr.spring.controller.UserController;
import com.zhr.spring.dao.UserDao;
import com.zhr.spring.dao.impl.UserDaoImpl;
import com.zhr.spring.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.Test;

public class test {
    /**
     * {@code @Component：将类标识为普通组件}
     * {@code @Controller：将类标识为控制层组件}
     * {@code @Service：将类标识为业务层组件}
     * {@code @Repository：将类标识为持久层组件}  */
    @Test
    public void  test() {
        ApplicationContext ioc = new ClassPathXmlApplicationContext("spring-ioc-annotation.xml");
//        UserController userController = ioc.getBean(UserController.class);
//        System.out.println(userController);
        UserService userService = ioc.getBean(UserService.class);
        System.out.println(userService);
        UserDao userDao = ioc.getBean(UserDao.class);
        System.out.println(userDao);

    }
}
