package com.qihang.shiro_test.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.qihang.shiro_test.entity.SecUserRole;
import org.apache.ibatis.annotations.Mapper;

/**
 * (SecUserRole)表数据库访问层
 *
 * @author makejava
 * @since 2020-09-02 17:33:23
 */
@Mapper
public interface SecUserRoleDao extends BaseMapper<SecUserRole> {

}