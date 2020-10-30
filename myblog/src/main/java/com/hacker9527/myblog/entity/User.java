package com.hacker9527.myblog.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;

/**
 * (User)实体类
 *
 * @author makejava
 * @since 2020-10-21 22:58:35
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {
    private static final long serialVersionUID = 491546563433341602L;
    
    private int id;

    @NotBlank(message = "邮箱不能为空！")
    @Email(message = "邮箱格式不对！")
    private String email;
    
    private String name;


    @NotBlank(message = "密码不对！")
    private String password;


}