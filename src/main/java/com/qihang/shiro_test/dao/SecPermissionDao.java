package com.qihang.shiro_test.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.qihang.shiro_test.entity.SecPermission;
import org.apache.ibatis.annotations.Mapper;

/**
 * (SecPermission)表数据库访问层
 *
 * @author makejava
 * @since 2020-09-02 17:33:18
 */
@Mapper
public interface SecPermissionDao extends BaseMapper<SecPermission> {

}