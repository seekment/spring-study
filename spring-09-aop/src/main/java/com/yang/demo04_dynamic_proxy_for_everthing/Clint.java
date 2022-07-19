package com.yang.demo04_dynamic_proxy_for_everthing;

import com.yang.demo02_static_proxy.UserService;
import com.yang.demo02_static_proxy.UserServiceImpl;

/**
 * @ClassName Clint
 * @Author yang
 * @Description //TODO
 * @Date 22/07/20 0:53
 * @Version v1.0
 **/


public class Clint {
    public static void main(String[] args) {
        // 1 真实的角色
        UserService userService = new UserServiceImpl();
        // 2 代理角色, 不存在
        ProxyInvocationHandler proxyInvocationHandler = new ProxyInvocationHandler();
       // 3 设置要代理的对象
        proxyInvocationHandler.setTarget(userService);
        // 4 动态代理生成代理对象
        UserService proxy = (UserService)proxyInvocationHandler.getProxy();

        proxy.add();
    }
}
