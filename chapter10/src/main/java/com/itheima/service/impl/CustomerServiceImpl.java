package com.itheima.service.impl;

import com.itheima.mapper.CustomerMapper;
import com.itheima.po.Customer;
import com.itheima.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerMapper customerMapper;

    @Override
    public void addCustomer(Customer customer) {
        this.customerMapper.addCustomer(customer);
        int i = 1 / 0;
    }
}
