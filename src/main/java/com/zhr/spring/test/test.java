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
     * {@code @Repository：将类标识为持久层组件}
     *  通过注解 + 扫描的方式所配置的bean的id，默认值为小驼峰，即类名的首字母为小写。
     *
     * */
    @Test
    public void  test() {
        ApplicationContext ioc = new ClassPathXmlApplicationContext("spring-ioc-annotation.xml");
        UserController userController = ioc.getBean(UserController.class);
        userController.saveUser();
    }
}
