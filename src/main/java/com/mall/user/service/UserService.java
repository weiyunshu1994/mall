package com.mall.user.service;

import com.mall.user.mbg.model.TUser;
import com.mall.user.mbg.model.TUserExample;

import java.util.List;

/**
 * UserService
 * Created by Alvin on 2021/5/8
 */
public interface UserService {

    // 统计用户个数
    int countByExample(TUserExample example);


    // 查询所有的用户信息
    List<TUser> listAllUser();

    // 添加用户
    int createUser(TUser user);

    // 更新用户信息
    int updateUser(Integer id,TUser user);

    // 删除用户信息
    int deleteUser(Integer id);

    // 分页查询用户的信息
    List<TUser> listUser(int pageNum, int pageSize);

    // 根据用户id查询用户信息
    TUser getUser(Integer id);
}
