package com.itheima.jdbc;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TransactionTest {

    @Test
    public void xmlTest(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        AccountDao dao = (AccountDao) context.getBean("accountDao");
        dao.transfer("Tom", "Jack", 100.0);
        System.out.println("转账成功!");
    }
}
