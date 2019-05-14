package com.itheima.dao.impl;

import com.itheima.dao.CustomerDao;
import com.itheima.po.Customer;
import org.mybatis.spring.support.SqlSessionDaoSupport;

public class CustomerDaoImpl extends SqlSessionDaoSupport implements CustomerDao {

    private final String cusPreStr = "com.itheima.po.";

    @Override
    public Customer findCustomerById(Integer id) {
        // 子 applicationContext.xml 中注入 sqlSessionFactory 对象，才能在子类中调用如下方法
        return this.getSqlSession().selectOne(cusPreStr + "CustomerMapper.findCustomerById",id);
    }
}
