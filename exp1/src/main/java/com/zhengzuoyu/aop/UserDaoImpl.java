package com.zhengzuoyu.aop;

public class UserDaoImpl implements UserDao {

    @Override
    public void add() {
        System.out.println("执行用户添加操作!");
    }

    @Override
    public void delete() {
        System.out.println("执行用户删除操作!");
    }
}
