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
     * @Autowired:实现自动装配的注解，
     * 1.@Autowired能够标识的位置
     *      标识在成员变量上，此时不需要来设置成员变量的set方法
     *      标识在set方法上
     *      为当前成员变量赋值的有参构造上
     * 2.@Autowired注解的原理
     *      默认通过byType的方式在ioc容器中通过类型匹配，某个bean为属性赋值
     *      若有多个类型匹配的bean会自动转化为byName的方式来实现自动装配的效果
     *          即将要赋值的属性名作为bean的id匹配某个bean为属性赋值
     *      若byName和byType的方式都无法实现自动装配，即IOC容器中有多个类型匹配的bean，
     *      且这些bean的id和要赋值的属性名都不一致，此时此时抛异常
     *      此时我们可以在要赋值的属性上添加一个注解@Qualifier("")
     *      通过该注解的val属性值来指定某个bean的id值，将这个bean为属性赋值
     * */
    @Test
    public void  test() {
        ApplicationContext ioc = new ClassPathXmlApplicationContext("spring-ioc-annotation.xml");
        UserController userController = ioc.getBean(UserController.class);
        userController.saveUser();
    }
}
