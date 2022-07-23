package com.yang.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName MyTest
 * @Author yang
 * @Description //TODO
 * @Date 22/07/23 16:36
 * @Version v1.0
 **/

// aop 实现方式一，代码实现
public class MyTest {
    public static void main(String[] args) {
        ApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationcontext.xml");
       // 动态代理代理的是接口，不能写成实现类，故下面这个不行
        UserService userService = classPathXmlApplicationContext.getBean("userService", UserService.class);
        userService.add();
        System.out.println();
    }
}
