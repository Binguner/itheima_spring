package com.zhengzuoyu.aop;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProxyFactoryBeanTest {

    @Test
    public void userProxyFactoryBeanTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("AopContext.xml");
        UserDao userDao = (UserDao) context.getBean("userDaoProxy");
        userDao.add();
        userDao.delete();
    }
}
