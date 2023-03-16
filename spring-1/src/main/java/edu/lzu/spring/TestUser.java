package edu.lzu.spring;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUser {
    @Test
    public void testUserObject() {
        // 加载spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

        // 获取创建的对像
        User user = (User)context.getBean("user");
        System.out.println("1:" + user);

        // 调用对象的方法
        user.add();
    }


    // 反射回顾 - 创建对象
    @Test
    public void testUserObject1() throws Exception {
        Class aClass = Class.forName("edu.lzu.spring.User");

        // User user = (User)aClass.newInstance();

        User user = (User)aClass.getDeclaredConstructor().newInstance();

        System.out.println(user);

        user.add();


    }
}
