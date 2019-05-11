package com.itheima.test;

import com.itheima.po.Customer;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MybatisTest {

    @Test
    public void findCustomByIdTest() throws IOException {
        // 1. 读取配置文件
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        // 2. 根据配置文件构建 SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        // 3. 通过 SqlSessionFactory 创建 SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();
        // 4. SqlSession 执行映射文件中定义的 SQL，并返回映射结果
        Customer customer = sqlSession.selectOne("com.itheima.mapper.CustomerMapper.findCustomerById",1);
        // 打印输出结果
        System.out.println(customer.toString());
        sqlSession.close();
    }

    @Test
    public void findCustomerByNameTest() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        List<Customer> customers = sqlSession.selectList("com.itheima.mapper.CustomerMapper.findCustomerByName","j");
        for (Customer customer : customers){
            System.out.println(customer);
        }
        sqlSession.close();
    }

    @Test
    public void addCustomerTest() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        Customer customer = new Customer();
        customer.setUsername("rose");
        customer.setJobs("coder");
        customer.setPhone("999999999999");
        int rows = sqlSession.insert("com.itheima.mapper.CustomerMapper.addCustomer",customer);
        if(rows > 0){
            System.out.println("你修改了 " + rows + " 条数据！");
        }else {
            System.out.println("执行插入操作失败！");
        }
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void updateCustomerTest() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        Customer customer = new Customer();
        customer.setId(4);
        customer.setUsername("rose");
        customer.setJobs("programmer");
        customer.setPhone("565656565656");
        int rows = sqlSession.update("com.itheima.mapper.CustomerMapper.updateCustomer",customer);
        if(rows > 0){
            System.out.println("你修改了 " + rows + " 条数据！");
        }else {
            System.out.println("执行插入操作失败！");
        }
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void deleteCustomerTest() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        int rows = sqlSession.delete("com.itheima.mapper.CustomerMapper.deleteCustomer",5);
        if(rows > 0){
            System.out.println("您删除了 " + rows + " 条数据！");
        }else {
            System.out.println("执行删除操作失败！");
        }
        sqlSession.commit();
        sqlSession.close();
    }

}
