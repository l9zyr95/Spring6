package edu.lzu.spring;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserTest {

    @Test
    public void getObject(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

        // 1、根据id获取对象
        User user = (User)context.getBean("user");
        System.out.println(user);

        // 2、根据类型获取对象
        User user2 = (User)context.getBean(User.class);
        System.out.println(user2);

        // 3、根据id和类型获取对象
        User user3 = (User) context.getBean("user", User.class);
        System.out.println(user3);


    }
}
