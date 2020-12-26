package com.xiaoweng.project.mapper;

import com.xiaoweng.project.dto.LoginDTO;
import com.xiaoweng.project.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @ClassName UserService
 * @Description TODO 数据访问层--UserMapper
 * @Date 2020/12/2
 * @Author XiaoWeng
 * @Version v1.0.0
 */
@Mapper
public interface UserMapper {

    User getUserByLogin(LoginDTO loginDTO);

    int deleteByPrimaryKey(Integer userId);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(User record);
}