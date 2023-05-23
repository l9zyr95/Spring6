package edu.lzu.spring;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUser {

    // 声明手动写日志的对象
    private Logger logger = LoggerFactory.getLogger(TestUser.class);

    @Test
    public void testUserObject() {

        // 1、加载spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

        // 2、获取创建的对像   -id属性值
        User user = (User)context.getBean("user");
        System.out.println("1:" + user);

        System.out.print("2:");

        // 3、调用对象的方法
        user.add();

        // 手动写日志
        logger.info("######### 执行成功了！！！");
    }


    // 反射回顾 - 创建对象
    @Test
    public void testUserObject1() throws Exception {

        // 拿到类
        Class aClass = Class.forName("edu.lzu.spring.User");

        // User user = (User)aClass.newInstance();

        // 反射创建对象
        User user = (User)aClass.getDeclaredConstructor().newInstance();

        System.out.println(user);

        user.add();


    }
}
