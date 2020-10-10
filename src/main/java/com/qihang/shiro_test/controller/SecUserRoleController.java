package com.qihang.shiro_test.controller;

import com.qihang.shiro_test.entity.SecUserRole;
import com.qihang.shiro_test.service.SecUserRoleService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (SecUserRole)表控制层
 *
 * @author makejava
 * @since 2020-09-02 17:49:59
 */
@RestController
@RequestMapping("secUserRole")
public class SecUserRoleController {
    /**
     * 服务对象
     */
    @Resource
    private SecUserRoleService secUserRoleService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public SecUserRole selectOne(Integer id) {
        return this.secUserRoleService.selectById(id);
    }

}