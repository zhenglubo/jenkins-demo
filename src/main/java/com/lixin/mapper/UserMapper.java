package com.lixin.mapper;

import com.lixin.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 用户表 Mapper 接口
 * </p>
 *
 * @author zhenglubo
 * @since 2020-04-26
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}
