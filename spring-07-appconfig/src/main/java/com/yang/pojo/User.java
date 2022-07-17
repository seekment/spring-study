package com.yang.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @ClassName User
 * @Author yang
 * @Description //TODO
 * @Date 22/07/17 23:42
 * @Version v1.0
 **/

@Component
public class User {
    @Value("yuanlin")
   private String name;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
