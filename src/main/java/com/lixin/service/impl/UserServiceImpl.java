package com.lixin.service.impl;

import com.lixin.entity.User;
import com.lixin.mapper.UserMapper;
import com.lixin.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author zhenglubo
 * @since 2020-04-26
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
