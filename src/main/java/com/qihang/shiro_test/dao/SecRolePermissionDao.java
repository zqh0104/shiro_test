package com.qihang.shiro_test.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.qihang.shiro_test.entity.SecRolePermission;
import org.apache.ibatis.annotations.Mapper;

/**
 * (SecRolePermission)表数据库访问层
 *
 * @author makejava
 * @since 2020-09-02 17:33:22
 */
@Mapper
public interface SecRolePermissionDao extends BaseMapper<SecRolePermission> {

}