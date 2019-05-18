package com.zhengzuoyu.test;

import com.zhengzuoyu.controller.StudentController;
import org.junit.Test;

public class StudentTest {

    @Test
    public void searchStudentTest() {
        System.out.println("Test");

        StudentController controller = new StudentController();
         controller.search(5);
    }
}
