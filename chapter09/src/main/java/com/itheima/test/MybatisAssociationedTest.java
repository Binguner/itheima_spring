package com.itheima.test;

import com.itheima.po.Orders;
import com.itheima.po.Person;
import com.itheima.po.User;
import com.itheima.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class MybatisAssociationedTest {

    private final String personPreStr = "com.itheima.mapper.PersonMapper.";
    private final String idCardPreStr = "com.itheima.mapper.IdCardMapper.";
    private final String userPreStr = "com.itheima.mapper.UserMapper.";
    private final String ordersPreStr = "com.itheima.mapper.OrdersMapper.";
    @Test
    public void findPersonByIdTest(){
        SqlSession sqlSession = MyBatisUtils.getSession();
        Person person = sqlSession.selectOne(personPreStr + "findPersonById", 1);
        System.out.println(person);
        sqlSession.close();
    }

    @Test
    public void findPersonByIdTest2(){
        SqlSession sqlSession = MyBatisUtils.getSession();
        Person person = sqlSession.selectOne(personPreStr+"findPersonById2",1);
        System.out.println(person);
        sqlSession.close();
    }

    @Test
    public void findUserTest(){
        SqlSession sqlSession = MyBatisUtils.getSession();
        User user = (User) sqlSession.selectOne(userPreStr+"findUserWithOrders",1);
        System.out.println(user);
        sqlSession.close();
    }

    @Test
    public void findOrdersTest(){
        SqlSession sqlSession = MyBatisUtils.getSession();
        Orders orders = sqlSession.selectOne(ordersPreStr+"findOrdersWithProductResult", 1);
        System.out.println(orders);
        sqlSession.close();
    }


}

