package com.xiaoweng.project.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * @ClassName LoginDTO
 * @Description TODO 登录传输类
 * @Date 2020/12/2
 * @Author XiaoWeng
 * @Version v1.0.0
 */
@Data
public class LoginDTO {
    @NotBlank(message = "用户名不能为空")
    private String username;
    @NotBlank(message = "密码不能为空")
    private String password;
}