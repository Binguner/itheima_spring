package com.itheima.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

//@org.springframework.stereotype.Controller
public class FirstController implements Controller {

    //    @RequestMapping("/firstController")
    @Override
    public ModelAndView handleRequest(javax.servlet.http.HttpServletRequest httpServletRequest, javax.servlet.http.HttpServletResponse httpServletResponse) throws Exception {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("msg", "这是我的第一个 Spring MVC 程序");
        modelAndView.setViewName("/WEB-INF/jsp/first.jsp");
        return modelAndView;
    }
}
