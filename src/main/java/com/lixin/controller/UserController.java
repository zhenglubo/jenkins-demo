package com.lixin.controller;


import com.lixin.dto.UserAddDto;
import com.lixin.entity.User;
import com.lixin.result.DataResult;
import com.lixin.result.DataResultBuilder;
import com.lixin.service.UserService;
import io.swagger.annotations.Api;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.time.LocalDateTime;

/**
 * <p>
 * 用户表 前端控制器
 * </p>
 *
 * @author zhenglubo
 * @since 2020-04-26
 */
@RestController
@RequestMapping("/user")
@Api(tags = "用户controller")
public class UserController {


    @Resource
    private UserService userService;

    @PostMapping("/add")
    public DataResult<Boolean> add(@RequestBody @Valid UserAddDto dto) {
        User user = new User();
        BeanUtils.copyProperties(user, dto);
        user.setCreatedTime(LocalDateTime.now());
        return userService.save(user) ? DataResultBuilder.success() : DataResultBuilder.fail("新增用户失败");
    }
}

