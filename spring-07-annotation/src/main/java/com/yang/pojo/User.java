package com.yang.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @ClassName User
 * @Author yang
 * @Description //TODO
 * @Date 22/07/17 23:40
 * @Version v1.0
 **/

@Component
public class User {
    @Value("yuanlin")
    private String name;
}
