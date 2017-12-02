package com.simple.service;

import com.simple.common.ServerResponse;
import com.simple.pojo.User;

/**
 * Create by S I M P L E on 2017/12/02
 */
public interface IUserService {

    ServerResponse<User> login(String username, String password);

    ServerResponse<String> resetPassword(String newPassword, String oldPassword, User user);
}
