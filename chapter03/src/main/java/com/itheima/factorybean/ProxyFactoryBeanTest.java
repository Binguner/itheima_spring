package com.itheima.factorybean;

import com.itheima.jdk.UserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProxyFactoryBeanTest {

    public static void main(String[] args) {
        String xmlPath = "applicationContext.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(xmlPath);
        // 从 Spring 容器中获得内容
        UserDao userDao = (UserDao) context.getBean("userDaoProxy");
        // 执行方法
        userDao.addUser();
        userDao.deleteUser();
    }

}
