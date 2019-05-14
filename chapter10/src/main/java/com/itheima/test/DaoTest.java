package com.itheima.test;

import com.itheima.dao.CustomerDao;
import com.itheima.mapper.CustomerMapper;
import com.itheima.po.Customer;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DaoTest {

    private ApplicationContext getContext(){
        return new ClassPathXmlApplicationContext("applicationContext.xml");
    }

    @Test
    public void findCustomerByIdDaoTest(){
        ApplicationContext context = getContext();
        CustomerDao customerDao = (CustomerDao) context.getBean("customerDao");
        Customer customer = customerDao.findCustomerById(1);
        System.out.println(customer);
    }

    @Test
    public void findCustomerByIdMapperTest(){
        ApplicationContext context = getContext();
        CustomerMapper customerMapper = context.getBean(CustomerMapper.class);
        Customer customer = customerMapper.findCustomerById(1);
        System.out.println(customer);
    }

}
