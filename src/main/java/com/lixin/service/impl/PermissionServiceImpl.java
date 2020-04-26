package com.lixin.service.impl;

import com.lixin.entity.Permission;
import com.lixin.mapper.PermissionMapper;
import com.lixin.service.PermissionService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 权限表 服务实现类
 * </p>
 *
 * @author zhenglubo
 * @since 2020-04-26
 */
@Service
public class PermissionServiceImpl extends ServiceImpl<PermissionMapper, Permission> implements PermissionService {

}
