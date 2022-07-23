package com.yang.demo01_static_proxy;

/**
 * @ClassName Proxy
 * @Author yang
 * @Description //TODO
 * @Date 22/07/18 0:42
 * @Version v1.0
 **/


public class Proxy implements Rent{
    Host host;
    public Proxy( Host host) {
       this.host = host;
    }

    @Override
    public void rent() {
        seeHouse();
        host.rent();
        mngMoney();
    }

    public void seeHouse(){
        System.out.println("中介去看房");
    }

    public void mngMoney(){
        System.out.println("帮房东收费");
    }
}
