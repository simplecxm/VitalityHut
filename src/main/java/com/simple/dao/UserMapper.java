package com.simple.dao;

import com.simple.pojo.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    int checkUsername(String username);

    User userLogin(@Param("username") String username,@Param("password") String password);

    int checkPassword(@Param("password") String password,@Param("userId")int userId);

    int checkEmailByUserId(@Param("email")String email,@Param("userId")int userId);

}