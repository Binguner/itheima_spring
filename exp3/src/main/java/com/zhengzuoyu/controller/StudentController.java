package com.zhengzuoyu.controller;

import com.zhengzuoyu.po.Student;
import com.zhengzuoyu.po.User;
import com.zhengzuoyu.service.StudentService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping("/toLogin")
    public String toLogin() {
        return "login";
    }

    @RequestMapping("/login")
    public String login(User user) {
        System.out.println(user.getUsername());
        System.out.println(user.getPassword());
//        if (user.getUsername().equals("root") && user.getPassword().equals("root")) {
//            return "redirect:main";
//        }
        return "redirect:/main";
    }

    @RequestMapping("/main")
    public String toMain(Model model) {
        List<Student> list = studentService.getAllStudent();
        if (null != list) {
            for (Student student : list) {
//                System.out.println(student);
            }
            model.addAttribute("list", list);
        } else {
            System.out.println("empty list");
        }

        return "main";
    }

    @RequestMapping("/search")
    public String search(int id) {
        System.out.println("here");
        Student student = studentService.findStudentById(id);
//        System.out.println(student);
//        System.out.println("can't find this student!");
        return "login";
    }

    @RequestMapping("/add")
    public void addStudent(Student student) {
        System.out.println(student);
//        studentService.addStudent(student);
    }

    @RequestMapping("/delete")
    public void deleteStudent(int id) {
        boolean flag = studentService.deleteStudentById(id);
        System.out.println("flag is : " + flag);
    }

    @RequestMapping("/update")
    public void updateStudent(Student student) {

        boolean flag = studentService.updateStudentInfo(student);
        System.out.println("Flag is : "+  flag);
    }

    @RequestMapping("/all")
    public void getAllStudent() {
        List<Student> list = studentService.getAllStudent();
        if (null != list) {
            for (Student student : list) {
                System.out.println(student);
            }
        } else {
            System.out.println("empty list");
        }
    }


}
