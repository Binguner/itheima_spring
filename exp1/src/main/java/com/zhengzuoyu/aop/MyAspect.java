package com.zhengzuoyu.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class MyAspect implements MethodInterceptor {

    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        check();
        Object o = invocation.proceed();
        log();
        return o;
    }

    private void check(){
        System.out.println("==模拟校验操作");
    }
    private void log() {
        System.out.println("==模拟日志处理操作");
    }
}
