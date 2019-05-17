package com.zhengzuoyu.service;

import com.zhengzuoyu.dao.StudentDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("studentService")
public class StudentServiceImpl implements StudentService {

    @Resource(name = "studentDao")
    private StudentDao studentDao;

    @Override
    public void save() {
        this.studentDao.save();
        System.out.println("StudentService saved a student");
    }

    public void setStudentDao(StudentDao studentDao){
        this.studentDao = studentDao;
    }
}
