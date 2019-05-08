package com.itheima.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestIoC {

    public static void main(String[] args) {
        // 1. 初始化 Spring 容器，加载配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 2. 通过容器获取 UserDao 实例
        UserDao userDao = (UserDao) context.getBean("userDao");
        userDao.say();
    }
}
