package com.yang.demo02_static_proxy;

/**
 * @ClassName UserServiceImpl
 * @Author yang
 * @Description //TODO
 * @Date 22/07/18 9:37
 * @Version v1.0
 **/


public class UserServiceImpl implements UserService{
    @Override
    public void add() {
        System.out.println("add");
    }

    @Override
    public void delete() {
        System.out.println("delete");
    }

    @Override
    public void update() {
        System.out.println("update");
    }
}
