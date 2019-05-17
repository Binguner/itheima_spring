package com.itheima.dao;

import com.itheima.po.Customer;

public interface CustomerDao {
    Customer findCustomerById(Integer id);
}
