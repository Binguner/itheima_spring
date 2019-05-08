package com.itheima.instance.static_factory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InstanceTest2 {
    public static void main(String[] args) {
        // 定义配置路径
        String xmlPath = "beans2.xml";
        // ApplicationContext 在加载文件时，对 Bean 进行实例化
        ApplicationContext context = new ClassPathXmlApplicationContext(xmlPath);
        System.out.println(context.getBean("bean2"));
    }
}
