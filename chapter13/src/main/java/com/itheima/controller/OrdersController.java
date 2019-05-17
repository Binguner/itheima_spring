package com.itheima.controller;

import com.itheima.po.Orders;
import com.itheima.po.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OrdersController {

    @RequestMapping("/toFindOrdersWithUser")
    public String toFindOrdersWithUser(){
        return "orders";
    }

    @RequestMapping("/findOrdersWithUser")
    public String findOrdersWithUser(Orders orders) {
        Integer orderId = orders.getOrdersId();
        User user = orders.getUser();
        String username = user.getUsername();
        Integer password = user.getPassword();
        System.out.println("orderId = " + orderId);
        System.out.println("username = " + username);
        System.out.println("password = " + password);
        return "success";
    }

}
