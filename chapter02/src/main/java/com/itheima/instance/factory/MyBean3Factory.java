package com.itheima.instance.factory;

public class MyBean3Factory {
    public MyBean3Factory(){
        System.out.println("Bean3 工厂实例化中");
    }
    public Bean3 creatBean(){
        return new Bean3();
    }
}
