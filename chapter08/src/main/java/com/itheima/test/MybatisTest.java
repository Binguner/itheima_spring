package com.itheima.test;

import com.itheima.po.Customer;
import com.itheima.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class MybatisTest {

    private final String preStr = "com.itheima.mapper.CustomerMapper.";

    @Test
    public void findCustomerByNameAndJobsTest(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        Customer customer = new Customer();
        customer.setUsername("jack");
        customer.setJobs("teacher");
        List<Customer> list = sqlSession.selectList("com.itheima.mapper.CustomerMapper.findCustomerByNameAndJobs",customer);
        for (Customer customer1 : list){
            System.out.println(customer1);
        }
        sqlSession.close();
    }

    @Test
    public void findCustomerByNameOrJobsTest(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        Customer customer = new Customer();
        customer.setUsername("jack");
        customer.setJobs("teacher");
        List<Customer> customers =  sqlSession.selectList("com.itheima.mapper.CustomerMapper.findCustomerByNameOrJobs",customer);
        for (Customer customer1: customers){
            System.out.println(customer1);
        }
        sqlSession.close();
    }

    @Test
    public void updateCustomerTest(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        Customer customer = new Customer();
        customer.setId(3);
        customer.setPhone("22222222");
        int rows = sqlSession.update("com.itheima.mapper.CustomerMapper.updateCustomer",customer);
        if (rows > 0){
            System.out.println("您成功修改了 " + rows + " 条数据！");
        }else {
            System.out.println("执行修改操作失败！");
        }
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void findCustomerByIdsTest() {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        List<Integer> ids = new ArrayList<Integer>();
        ids.add(1);
        ids.add(2);
        List<Customer> customers = sqlSession.selectList(preStr+"findCustomerByIds",ids);
        for (Customer customer : customers){
            System.out.println(customer);
        }
        sqlSession.close();
    }

    @Test
    public void findCustomerByNameTest(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        Customer customer = new Customer();
        customer.setUsername("j");
        List<Customer> customers = sqlSession.selectList(preStr + "findCustomerByName", customer);
        for (Customer customer1 : customers){
            System.out.println(customer1);
        }
        sqlSession.close();
    }
}
