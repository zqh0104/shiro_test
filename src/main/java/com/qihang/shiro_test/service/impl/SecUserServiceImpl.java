package com.qihang.shiro_test.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.qihang.shiro_test.dao.SecUserDao;
import com.qihang.shiro_test.entity.SecUser;
import com.qihang.shiro_test.service.SecUserService;
import org.springframework.stereotype.Service;

/**
 * (SecUser)表服务实现类
 *
 * @author makejava
 * @since 2020-09-02 17:33:23
 */
@Service("secUserService")
public class SecUserServiceImpl extends ServiceImpl<SecUserDao, SecUser> implements SecUserService {

}