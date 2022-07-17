package com.yang.demo01_static_proxy;

/**
 * @ClassName Clinet
 * @Author yang
 * @Description //TODO
 * @Date 22/07/18 0:41
 * @Version v1.0
 **/


public class Clinet {
    public static void main(String[] args) {
        Host host = new Host();
        Proxy proxy = new Proxy(host);
        proxy.rent();
    }
}
