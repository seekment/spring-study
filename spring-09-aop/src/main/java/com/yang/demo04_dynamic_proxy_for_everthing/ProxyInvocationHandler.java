package com.yang.demo04_dynamic_proxy_for_everthing;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @ClassName ProxyInvocationHandler
 * @Author yang
 * @Description //TODO
 * @Date 22/07/20 0:48
 * @Version v1.0
 **/

// 使用这个万能的动态代理类，代理任何其他对象
public class ProxyInvocationHandler implements InvocationHandler {
    // 1 被代理的接口
    private Object target;

    public void setTarget(Object target) {
        this.target = target;
    }
// 2 生成得到代理类
    public Object getProxy(){
        return Proxy.newProxyInstance(this.getClass().getClassLoader(),
                target.getClass().getInterfaces(),this);
    }

    // 3 处理代理实例，并返回结果
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        log(method.getName());
        Object result = method.invoke(target,args);
        return result;
    }

    void log(String msg){
        System.out.println("执行了什么方法"+msg);
    }
}
