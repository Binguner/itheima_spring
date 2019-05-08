package com.itheima.instance.factory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InstanceTest3 {

    public static void main(String[] args) {
        // 定义配置文件l路径
        String xmlPath = "beans3.xml";
        // ApplicationContext 在加载文件时，对 Bean 进行实例化
        ApplicationContext context = new ClassPathXmlApplicationContext(xmlPath);
        System.out.println(context.getBean("bean3"));
    }
}
