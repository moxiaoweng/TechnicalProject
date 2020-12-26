package com.xiaoweng.project.service.impl;

import com.xiaoweng.project.dto.LoginDTO;
import com.xiaoweng.project.entity.User;
import com.xiaoweng.project.mapper.UserMapper;
import com.xiaoweng.project.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName UserServiceImpl
 * @Description TODO 实现UserService
 * @Date 2020/12/2
 * @Author XiaoWeng
 * @Version v1.0.0
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public User getUser(LoginDTO loginDTO) {
        return userMapper.getUserByLogin(loginDTO);
    }
}
