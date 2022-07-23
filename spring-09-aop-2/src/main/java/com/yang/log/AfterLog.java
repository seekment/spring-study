package com.yang.log;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * @ClassName AfterLog
 * @Author yang
 * @Description //TODO
 * @Date 22/07/21 9:52
 * @Version v1.0
 **/


public class AfterLog implements AfterReturningAdvice {
    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println(target.getClass().getName()+"的"+method.getName()+" 被执行了"+" 返回了什么结果是： "+returnValue);
    }
}
