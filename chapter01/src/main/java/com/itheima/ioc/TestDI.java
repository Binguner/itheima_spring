package com.itheima.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDI {

    public static void main(String[] args) {
        // 1. 初始化 Spring 容器，加载配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 2. 通过容器获取 UserService 实例、
        UserService service = (UserService) context.getBean("userService");
        service.say();
    }
}
