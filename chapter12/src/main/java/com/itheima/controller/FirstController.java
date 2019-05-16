package com.itheima.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping(value = "/hello")
public class FirstController {

    @RequestMapping(value = "/firstController")
    public String handlerRequest(HttpServletRequest request, HttpServletResponse response, Model model) {
//        向模型对象中添加数据
        model.addAttribute("msg", "这是我的抵押给 Spring MVC 程序！");
//        返回视图页面
        return "first";
    }
}
