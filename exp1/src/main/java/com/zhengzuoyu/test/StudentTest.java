package com.zhengzuoyu.test;

import com.zhengzuoyu.controller.StudentController;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentTest {

    @Test
    public void studentTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        StudentController controller = (StudentController) context.getBean("studentController");
        controller.save();
    }
}
