package com.zhengzuoyu.test;

import com.zhengzuoyu.po.Student;
import com.zhengzuoyu.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyBatisTest {

    private final String preStr = "com.zhengzuoyu.mapper.StudentMapper.";

    @Test
    public void addStudentTest() {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        Student student = new Student();
        student.setName("ZhangSan4");
        student.setAge(18);
        student.setGender("female");
        student.setAddress("Shanxi");
        student.setNumber(02);
        student.setStatus(1);
        int rows = sqlSession.insert(preStr + "addStudent",student);
        if (rows > 0) {
            System.out.println("插入数据成功!");
            System.out.println(student);
        } else {
            System.out.println("插入数据失败!");
        }
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void deleteStudentTest(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        int rows = sqlSession.delete(preStr + "deleteStudent", 3);
        if (rows > 0) {
            System.out.println("您删除了 " + rows + " 条数据!");
        } else {
            System.out.println("删除数据失败!");
        }
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void updateStudentTest() {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        Student student = new Student();
        student.setId(2);
        student.setName("JackMa");
        student.setAge(53);
        int rows = sqlSession.update(preStr + "updateStudent", student);
        if(rows > 0){
            System.out.println("你修改了 " + rows + " 条数据！");
        }else {
            System.out.println("执行插入操作失败！");
        }
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void selectStudentByIdTest() {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        Student student = sqlSession.selectOne(preStr+"selectStudentById",6);
        if (null != student) {
            System.out.println(student);
        } else {
            System.out.println("找不到该学生！");
        }
        sqlSession.close();
    }

    @Test
    public void selectStudentByNameTest() {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        List<Student> students = sqlSession.selectList(preStr + "selectStudentByName", "ZhangSan");
        if (null != students) {
            for (Student student : students) {
                System.out.println(student);
            }
        } else {
            System.out.println("找不到该学生！");
        }
        sqlSession.close();
    }

    @Test
    public void selectStudentByNameOrAddressTest(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        Map<String, String> map = new HashMap<>();
        map.put("name", "ZhangSan4");
//        map.put("address", "Shanxi");
        List<Student> students = sqlSession.selectList(preStr + "selectStudentByNameOrAddress", map);
        if (null != students) {
            for (Student student : students) {
                System.out.println(student);
            }
        } else {
            System.out.println("找不到该学生！");
        }
    }


}
