package com.yang.demo02_static_proxy;

/**
 * @ClassName UserServiceProxy
 * @Author yang
 * @Description //TODO
 * @Date 22/07/18 9:39
 * @Version v1.0
 **/


public class UserServiceProxy implements UserService{
    private UserServiceImpl userService;

    public UserServiceProxy(UserServiceImpl userService) {
        this.userService = userService;
    }

    @Override
    public void add() {
        newFun();
        userService.add();
    }

    @Override
    public void delete() {
        newFun();
        userService.delete();
    }

    @Override
    public void update() {
        newFun();
        userService.update();
    }

    void newFun(){
        System.out.println("方法执行前");
    }
}
