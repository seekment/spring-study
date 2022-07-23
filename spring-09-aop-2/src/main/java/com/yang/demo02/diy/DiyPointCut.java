package com.yang.demo02.diy;

/**
 * @ClassName DiyPointCut
 * @Author yang
 * @Description //TODO
 * @Date 22/07/23 17:08
 * @Version v1.0
 **/


public class DiyPointCut {
    void before(){
        System.out.println("第二种方式=======方法执行前！==============");
    }

    void after(){
        System.out.println("第二种方式========方法执行后！==============");
    }
}
