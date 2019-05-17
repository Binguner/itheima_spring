package com.zhengzuoyu.dao;

public class StudentDaoImpl implements StudentDao {

    @Override
    public void save() {
        System.out.println("StudentDao saved a student");
    }

}
