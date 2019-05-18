package com.zhengzuoyu.dao;

import com.zhengzuoyu.po.Student;

import java.util.List;

public interface StudentDao {

    Student findStudentById(int id);
    boolean deleteStudentById(int id);
    boolean updateStudentInfo(Student student);
    boolean addStudent(Student student);
    List<Student> getAllStudent();
}
