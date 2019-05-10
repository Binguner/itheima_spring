package com.itheima.jdbc;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import java.io.File;
import java.util.List;

public class JdbcTemplateTest {
    public static void main(String[] args) {
        File file = new File("");
        System.out.println(file.getAbsoluteFile());
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        JdbcTemplate template = (JdbcTemplate) context.getBean("jdbcTemplate");
        template.execute("create table account(" +
                "id int primary key auto_increment," +
                "username varchar(50)," +
                "balance double )");
        System.out.println("账户表 account 创建成功！");
    }

    @Test
    public void addAccountTest(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        AccountDao dao = (AccountDao) context.getBean("accountDao");
        Account account = new Account();
        account.setUsername("Binguner");
        account.setBalance(123123123.0);
        int num = dao.addAcount(account);
        if (num > 0){
            System.out.println("成功插入了 " + num + "条数据！");
        }else {
            System.out.println("插入操作失败！");
        }
    }

    @Test
    public void updateAccountTest(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        AccountDao dao = (AccountDao) context.getBean("accountDao");
        Account account = new Account();
        account.setId(1);
        account.setUsername("BingunerZheng");
        account.setBalance(99999999.0);
        int num = dao.updateAccount(account);
        if (num > 0){
            System.out.println("成功插入了 " + num + "条数据！");
        }else {
            System.out.println("插入操作失败！");
        }
    }

    @Test
    public void deleteAccount(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        AccountDao dao = (AccountDao) context.getBean("accountDao");
        int num = dao.deleteAccount(1);
        if (num > 0){
            System.out.println("成功插入了 " + num + " 条数据！");
        }else {
            System.out.println("插入操作失败！");
        }
    }

    @Test
    public void findAcctountByIdTest(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        AccountDao dao = (AccountDao) context.getBean("accountDao");
        Account account = dao.findAccountBy(2);
        System.out.println(account);
    }

    @Test
    public void findAllAcountTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        AccountDao dao = (AccountDao) context.getBean("accountDao");
        List<Account> list = dao.findAllAccount();
        for(Account account: list){
            System.out.println(account);
        }
    }
}
