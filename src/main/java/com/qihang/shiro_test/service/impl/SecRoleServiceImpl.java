package com.qihang.shiro_test.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.qihang.shiro_test.dao.SecRoleDao;
import com.qihang.shiro_test.entity.SecRole;
import com.qihang.shiro_test.service.SecRoleService;
import org.springframework.stereotype.Service;

/**
 * (SecRole)表服务实现类
 *
 * @author makejava
 * @since 2020-09-02 17:33:21
 */
@Service("secRoleService")
public class SecRoleServiceImpl extends ServiceImpl<SecRoleDao, SecRole> implements SecRoleService {

}