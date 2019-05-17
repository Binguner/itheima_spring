package com.itheima.service.impl;

import com.itheima.dao.CustomerDao;
import com.itheima.po.Customer;
import com.itheima.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

// 业务层
@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {

    // 将 CustomerDao 接口对象注入到本类中
    @Autowired
    private CustomerDao customerDao;

    @Override
    public Customer findCustomerById(Integer id) {
        return this.customerDao.findCustomerById(id);
    }
}
