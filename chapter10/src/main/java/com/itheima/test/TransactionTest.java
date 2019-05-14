package com.itheima.test;

import com.itheima.po.Customer;
import com.itheima.service.CustomerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TransactionTest {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        CustomerService customerService = context.getBean(CustomerService.class);
        Customer customer = new Customer();
        customer.setUsername("ZhangSan");
        customer.setJobs("Manager");
        customer.setPhone("1233333333");
        customerService.addCustomer(customer);
    }
}
