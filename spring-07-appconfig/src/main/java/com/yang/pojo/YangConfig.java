package com.yang.pojo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName YangConfig
 * @Author yang
 * @Description //TODO
 * @Date 22/07/17 23:43
 * @Version v1.0
 **/

@Configuration
public class YangConfig {
    @Bean
    public User getUser(){
        return new User();
    }
}
