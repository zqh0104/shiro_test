package com.qihang.shiro_test.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.qihang.shiro_test.dao.SecRolePermissionDao;
import com.qihang.shiro_test.entity.SecRolePermission;
import com.qihang.shiro_test.service.SecRolePermissionService;
import org.springframework.stereotype.Service;

/**
 * (SecRolePermission)表服务实现类
 *
 * @author makejava
 * @since 2020-09-02 17:33:22
 */
@Service("secRolePermissionService")
public class SecRolePermissionServiceImpl extends ServiceImpl<SecRolePermissionDao, SecRolePermission> implements SecRolePermissionService {

}