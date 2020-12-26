package com.xiaoweng.project.controller;

import com.xiaoweng.project.common.result.Result;
import com.xiaoweng.project.common.result.ResultBuilder;
import com.xiaoweng.project.common.result.ResultCode;
import com.xiaoweng.project.dto.LoginDTO;
import com.xiaoweng.project.entity.User;
import com.xiaoweng.project.service.UserService;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Objects;

/**
 * @ClassName UserController
 * @Description TODO 用户模块
 * @Date 2020/12/2
 * @Author XiaoWeng
 * @Version v1.0.0
 */
@RestController
@RequestMapping("/user")
@Api(tags = "用户模块")
public class UserController {

    @Autowired
    UserService userService;

    @ApiOperation(value = "登录",
            notes = "用户登录")
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public Result<User> login(@Valid LoginDTO loginDTO, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            String msg = Objects.requireNonNull(bindingResult.getFieldError()).getDefaultMessage();
            return ResultBuilder.fail(ResultCode.PARAM_IS_BLANK);
        }
        System.out.println(loginDTO.getPassword());
        System.out.println(loginDTO.getUsername());
        User user = userService.getUser(loginDTO);
        if (user == null || !user.getPassword().equals(loginDTO.getPassword())) {
            return ResultBuilder.fail(ResultCode.USER_LOGIN_ERROR);
        }
        return ResultBuilder.success(ResultCode.SUCCESS, user);
    }
}
