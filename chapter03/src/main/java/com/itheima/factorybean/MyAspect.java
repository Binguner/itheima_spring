package com.itheima.factorybean;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class MyAspect implements MethodInterceptor {


    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        check_permission();
        // 执行目标方法
        Object o = methodInvocation.proceed();
        log();
        return o;
    }

    public void check_permission(){
        System.out.println("模拟检查权限。。。");
    }

    public void log(){
        System.out.println("模拟记录日志。。。");
    }

}