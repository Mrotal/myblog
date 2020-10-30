package com.hacker9527.myblog.controller;

import com.hacker9527.myblog.common.Result;
import com.hacker9527.myblog.entity.User;
import com.hacker9527.myblog.service.UserService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;

/**
 * (User)表控制层
 *
 * @author makejava
 * @since 2020-10-21 22:58:38
 */
@RestController
@RequestMapping("user")
public class UserController {
    /**
     * 服务对象
     */
    @Resource
    private UserService userService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Result selectOne(int id) {
        int i = 2/id;
        return Result.success(userService.queryById(id));
    }
    @PostMapping("save")
    @Validated
    public Result save(@Valid @RequestBody User user) {
        //userService.insert(user);
        return Result.success(user);
    }

}