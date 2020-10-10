package com.qihang.shiro_test.controller;

import com.qihang.shiro_test.entity.SecRole;
import com.qihang.shiro_test.service.SecRoleService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (SecRole)表控制层
 *
 * @author makejava
 * @since 2020-09-02 17:49:59
 */
@RestController
@RequestMapping("secRole")
public class SecRoleController {
    /**
     * 服务对象
     */
    @Resource
    private SecRoleService secRoleService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public SecRole selectOne(Integer id) {
        return this.secRoleService.selectById(id);
    }

}