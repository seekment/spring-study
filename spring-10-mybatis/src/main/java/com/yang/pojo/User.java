package com.yang.pojo;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * @ClassName User
 * @Author yang
 * @Description //TODO
 * @Date 22/07/23 18:05
 * @Version v1.0
 **/

@Data
@Getter
@Setter
public class User {
    private int id;
    private String gender;
    private String birth;
    private String department;
    private String address;
}