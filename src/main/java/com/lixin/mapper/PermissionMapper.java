package com.lixin.mapper;

import com.lixin.entity.Permission;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 权限表 Mapper 接口
 * </p>
 *
 * @author zhenglubo
 * @since 2020-04-26
 */
@Mapper
public interface PermissionMapper extends BaseMapper<Permission> {

}
