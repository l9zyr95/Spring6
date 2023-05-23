package edu.lzu.spring.bean1;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUserDaoImpl {
    @Test
    public void test1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

        // 指向的是它的实现类的对象
        UserDao user = context.getBean(UserDao.class);

        user.run();
    }
}
