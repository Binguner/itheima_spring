package com.itheima.instance.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.File;

public class InstancesTest1 {

    public static void main(String[] args) {
        // 定义配置文件l路径
        String xmlPath = "beans1.xml";
        // ApplicationContext 在加载配置文件时，对 Bean 进行实例化
        ApplicationContext context = new ClassPathXmlApplicationContext(xmlPath);
        Bean1 bean1 = (Bean1) context.getBean("bean1");
        System.out.println(bean1);
    }
}
