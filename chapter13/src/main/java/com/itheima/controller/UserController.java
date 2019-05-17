package com.itheima.controller;

import com.itheima.po.User;
import com.itheima.vo.UserVO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class UserController {

    // 绑定默认数据类型
    @RequestMapping(value = "selectUser1")
    public String selectUser1(HttpServletRequest request){
        String id = request.getParameter("id");
        System.out.println("id = " + id);
        return "success";
    }

    // 绑定简单数据类型
    @RequestMapping(value = "selectUser2")
    public String selectUser2(Integer id){
        System.out.println("id = " + id);
        return "success";
    }

    // 通过 @RequestParam 绑定简单数据
    @RequestMapping(value = "selectUser3")
    public String selectUser3(@RequestParam(value = "user_id", required = false, defaultValue = "88") Integer id) {
        System.out.println("user_id = " + id);
        return "success";
    }

    // 跳转到用户注册界面
    @RequestMapping(value = "/toRegister")
    public String toRegister(){
        return "register";
    }

    // 接受用户注册信息
    @RequestMapping("/registerUser")
    public String registerUser(User user) {
        String username = user.getUsername();
        Integer password = user.getPassword();
        System.out.println("username = " + username);
        System.out.println("password = " + password);
        return "success";
    }


    // 向用户列表跳转
    @RequestMapping(value = "/toUser")
    public String selectUsers(){
        return "user";
    }

    // 接受批量删除用户的方法
    @RequestMapping(value = "/deleteUsers")
    public String deleteUsers(Integer[] ids) {
        if (null != ids){
            for (Integer integer : ids){
                System.out.println("删除了 id 为 " + integer + " 的用户！");
            }
        }else {
            System.out.println("ids == null");
        }
        return "success";
    }

    // 向用户批量修改页面的跳转
    @RequestMapping(value = "/toUserEdit")
    public String toUserEdit(){
        return "user_edit";
    }

    // 接收批量修改用户的方法
    @RequestMapping("/editUsers")
    public String editUsers(UserVO userList) {
        List<User> users = userList.getUsers();
        for (User user : users) {
            System.out.println("修改了 id 为 " + user.getId() + " 的用户名为：" + user.getUsername());
        }
        return "success";
    }

}
