package com.qihang.shiro_test.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.qihang.shiro_test.entity.SecRole;
import org.apache.ibatis.annotations.Mapper;

/**
 * (SecRole)表数据库访问层
 *
 * @author makejava
 * @since 2020-09-02 17:33:21
 */
@Mapper
public interface SecRoleDao extends BaseMapper<SecRole> {

}