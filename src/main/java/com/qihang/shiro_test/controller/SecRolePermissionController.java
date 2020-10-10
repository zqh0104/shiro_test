package com.qihang.shiro_test.controller;

import com.qihang.shiro_test.entity.SecRolePermission;
import com.qihang.shiro_test.service.SecRolePermissionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (SecRolePermission)表控制层
 *
 * @author makejava
 * @since 2020-09-02 17:49:59
 */
@RestController
@RequestMapping("secRolePermission")
public class SecRolePermissionController {
    /**
     * 服务对象
     */
    @Resource
    private SecRolePermissionService secRolePermissionService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public SecRolePermission selectOne(Integer id) {
        return this.secRolePermissionService.selectById(id);
    }

}