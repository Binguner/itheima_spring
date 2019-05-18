package com.zhengzuoyu.service;

import com.zhengzuoyu.po.Student;

import java.util.List;

public interface StudentService {

    Student findStudentById(int id);
    boolean deleteStudentById(int id);
    boolean updateStudentInfo(Student student);
    boolean addStudent(Student student);
    List<Student> getAllStudent();
}
