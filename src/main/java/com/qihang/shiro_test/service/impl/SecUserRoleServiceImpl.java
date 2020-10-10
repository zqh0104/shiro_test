package com.qihang.shiro_test.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.qihang.shiro_test.dao.SecUserRoleDao;
import com.qihang.shiro_test.entity.SecUserRole;
import com.qihang.shiro_test.service.SecUserRoleService;
import org.springframework.stereotype.Service;

/**
 * (SecUserRole)表服务实现类
 *
 * @author makejava
 * @since 2020-09-02 17:33:24
 */
@Service("secUserRoleService")
public class SecUserRoleServiceImpl extends ServiceImpl<SecUserRoleDao, SecUserRole> implements SecUserRoleService {

}