package com.this0.blog.controller;

import com.this0.blog.entity.User;
import com.this0.blog.service.UserService;
import com.this0.blog.utils.Result;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@CrossOrigin
@RequestMapping("/user")
@Tag(name = "用户模块")
public class UserController {

    @Autowired
    private UserService userService;

    @Operation(summary = "用户登陆")
    @PostMapping("/login")
    public Result login(@RequestBody User user) {

        //TODO,最简单的登录查询，不妥当，必须改
        User loginUser = userService.login(user);

        //传递uid及uname
        if (loginUser != null) {
            Map<String, Object> map = new HashMap<>();
            map.put("uid", loginUser.getUid());
            map.put("username", loginUser.getUsername());
            return Result.ok(map);
        }
        return Result.fail();
    }

}
