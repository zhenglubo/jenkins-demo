package com.lixin.service.impl;

import com.lixin.entity.Role;
import com.lixin.mapper.RoleMapper;
import com.lixin.service.RoleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 角色表 服务实现类
 * </p>
 *
 * @author zhenglubo
 * @since 2020-04-26
 */
@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements RoleService {

}
