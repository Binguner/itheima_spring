package com.itheima.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationAssembleTest {
    public static void main(String[] args) {
        // 定义配置文件路径
        String xmlPath = "beans6.xml";
        // 加载配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext(xmlPath);
//         获取 UserController 实例
        UserController userController = (UserController) context.getBean("userController");
//         调用 UserController 中的 save 方法
        userController.save();
//        UserDaoImpl userDao = (UserDaoImpl) context.getBean("userDao");
//        userDao.save();
//        UserServiceImpl userService = (UserServiceImpl) context.getBean("userService");
//        userService.save();
    }
}
