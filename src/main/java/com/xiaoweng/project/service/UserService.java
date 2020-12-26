package com.xiaoweng.project.service;

import com.xiaoweng.project.dto.LoginDTO;
import com.xiaoweng.project.entity.User;

/**
 * @ClassName UserService
 * @Description TODO 业务逻辑层--UserService
 * @Date 2020/12/2
 * @Author XiaoWeng
 * @Version v1.0.0
 */
public interface UserService {
    User getUser(LoginDTO loginDTO);
}
