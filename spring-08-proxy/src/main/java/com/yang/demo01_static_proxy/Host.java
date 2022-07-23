package com.yang.demo01_static_proxy;

/**
 * @ClassName Host
 * @Author yang
 * @Description //TODO
 * @Date 22/07/18 0:40
 * @Version v1.0
 **/


public class Host implements Rent{
    @Override
    public void rent() {
        System.out.println("房东去租房");
    }
}
