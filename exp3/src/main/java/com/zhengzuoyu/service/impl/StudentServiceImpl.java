package com.zhengzuoyu.service.impl;

import com.zhengzuoyu.dao.StudentDao;
import com.zhengzuoyu.po.Student;
import com.zhengzuoyu.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDao studentDao;

    @Override
    public Student findStudentById(int id) {
        return this.studentDao.findStudentById(id);
    }

    @Override
    public boolean deleteStudentById(int id) {
        return this.studentDao.deleteStudentById(id);
    }

    @Override
    public boolean updateStudentInfo(Student student) {
        return this.studentDao.updateStudentInfo(student);
    }

    @Override
    public boolean addStudent(Student student) {
        return this.studentDao.addStudent(student);
    }

    @Override
    public List<Student> getAllStudent() {
        return this.studentDao.getAllStudent();
    }


}
