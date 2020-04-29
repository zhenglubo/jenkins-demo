package com.lixin.controller;


import com.lixin.result.DataResult;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 角色表 前端控制器
 * </p>
 *
 * @author zhenglubo
 * @since 2020-04-26
 */
@RestController
@RequestMapping("/role")
public class RoleController {

    @ApiOperation(value = "新增角色")
    @PostMapping("/add")
    public DataResult add(){
        return null;
    }

}

