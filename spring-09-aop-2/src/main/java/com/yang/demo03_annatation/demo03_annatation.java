package com.yang.demo03_annatation;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * @ClassName demo03_annatation
 * @Author yang
 * @Description //TODO
 * @Date 22/07/23 17:27
 * @Version v1.0
 **/
//需要注册bean,或者实现@commpont注解
@Aspect
public class demo03_annatation {
    @Before("execution(* com.yang.service.UserServiceImpl.*(..))")
    public void before(){
        System.out.println("aop实现方式3，直接通过注解实现！================before");
    }
}
