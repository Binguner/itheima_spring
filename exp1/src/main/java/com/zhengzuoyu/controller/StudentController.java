package com.zhengzuoyu.controller;

import com.zhengzuoyu.service.StudentService;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Controller("studentController")
public class StudentController {

    @Resource(name = "studentService")
    private StudentService studentService;

    public void save(){
        studentService.save();
        System.out.println("StudentController saved a student");
    }

    public void setStudentService(StudentService studentService) {
        this.studentService = studentService;
    }
}
