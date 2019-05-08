package com.itheima.aspectj.xml;

import com.itheima.jdk.UserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestXmlAspextJ {
    public static void main(String[] args) {
        String xmlPath = "applicationContext2.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(xmlPath);
        // 1. 从 Spring 容器获得内容
        UserDao userDao = (UserDao) context.getBean("userDao");
        // 2. 执行方法
        userDao.addUser();
    }
}
