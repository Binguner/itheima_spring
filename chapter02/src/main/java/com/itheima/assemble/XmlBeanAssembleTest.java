package com.itheima.assemble;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlBeanAssembleTest {
    public static void main(String[] args) {
        // 定义配置文件l路径
        String xmlPath = "beans5.xml";
        // ApplicationContext 在加载配置文件时，对 Bean 进行实例化
        ApplicationContext context = new ClassPathXmlApplicationContext(xmlPath);
        // 构造方式输出结果
        System.out.println(context.getBean("user1"));
        // 设值方式输出结果
        System.out.println(context.getBean("user2"));
    }
}
