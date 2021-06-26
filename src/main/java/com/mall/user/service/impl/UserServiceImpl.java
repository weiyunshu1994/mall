package com.mall.user.service.impl;

import com.mall.user.mbg.mapper.TUserMapper;
import com.mall.user.mbg.model.TUser;
import com.mall.user.mbg.model.TUserExample;
import com.mall.user.service.UserService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * TUserService实现类
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private TUserMapper userMapper;

    @Override
    public int countByExample(TUserExample example) {
        return userMapper.countByExample(new TUserExample());
    }

    @Override
    public List<TUser> listAllUser() {
        return userMapper.selectByExample(new TUserExample());
    }

    @Override
    public int createUser(TUser user) {
        return userMapper.insert(user);
    }

    @Override
    public int updateUser(Integer id, TUser user) {
        user.setId(id);
        return userMapper.updateByExampleSelective(user,new TUserExample());
    }

    @Override
    public int deleteUser(Integer id) {
        return userMapper.deleteByPrimaryKey(id);
    }

    @Override
    public List<TUser> listUser(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        return userMapper.selectByExample(new TUserExample());
    }

    @Override
    public TUser getUser(Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }
}
