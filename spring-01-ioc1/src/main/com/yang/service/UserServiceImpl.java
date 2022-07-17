package com.yang.service;

import com.yang.dao.UserDao;

/**
 * @ClassName UserServiceImpl
 * @Author yang
 * @Description //TODO
 * @Date 22/07/17 9:59
 * @Version v1.0
 **/


public  class UserServiceImpl implements com.yang.service.UserService {

    private UserDao user;
    // private UserDao user =  new UserDaoImpl();
  //  private UserDao user =  new UserDaoImpl();

    public UserServiceImpl(UserDao user) {
        this.user = user;
    }

    @Override
    public void getUser() {
        user.getUser();
    }
}
