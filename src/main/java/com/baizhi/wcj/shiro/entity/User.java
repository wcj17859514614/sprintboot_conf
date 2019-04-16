package com.baizhi.wcj.shiro.entity;


import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.context.annotation.ApplicationScope;

@Data
@NoArgsConstructor
@ApplicationScope
public class User {
    private Integer id;
    private String username;
    private String name;
    private String password;
    private String sex;
}
