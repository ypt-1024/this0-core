package com.this0.blog.service.impl;

import com.this0.blog.entity.User;
import com.this0.blog.mapper.UserMapper;
import com.this0.blog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    @Transactional(readOnly = true)
    public User login(User user) {

        //查询用户
        User loginUser = userMapper.selectUser(user);
        if (loginUser!=null){

            //用户密码也匹配
            if (loginUser.getPassword().equals(user.getPassword())){

                return loginUser;
            }
        }
        return null;
    }
}

