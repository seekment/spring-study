package com.yang.mapper;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * @ClassName User
 * @Author yang
 * @Description //TODO
 * @Date 22/07/23 18:05
 * @Version v1.0
 **/
@Component
@Data
public class User {
    private String id;
    private String gender;
    private String birth;
    private String department;
    private String address;
}