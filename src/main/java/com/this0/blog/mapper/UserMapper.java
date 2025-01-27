package com.this0.blog.mapper;

import com.this0.blog.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    User selectUser(User user);
}
