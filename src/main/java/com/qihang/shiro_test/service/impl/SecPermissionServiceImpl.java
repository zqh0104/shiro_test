package com.qihang.shiro_test.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.qihang.shiro_test.dao.SecPermissionDao;
import com.qihang.shiro_test.entity.SecPermission;
import com.qihang.shiro_test.service.SecPermissionService;
import org.springframework.stereotype.Service;

/**
 * (SecPermission)表服务实现类
 *
 * @author makejava
 * @since 2020-09-02 17:33:19
 */
@Service("secPermissionService")
public class SecPermissionServiceImpl extends ServiceImpl<SecPermissionDao, SecPermission> implements SecPermissionService {

}