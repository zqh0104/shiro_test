package com.qihang.shiro_test.entity;

import com.baomidou.mybatisplus.activerecord.Model;
import lombok.Data;

import java.io.Serializable;

/**
 * (SecRolePermission)表实体类
 *
 * @author makejava
 * @since 2020-09-02 17:33:22
 */
@SuppressWarnings("serial")
@Data
public class SecRolePermission extends Model<SecRolePermission> {

    private Integer id;

    private Integer roleId;

    private Integer permissionId;

    /**
     * 获取主键值
     *
     * @return 主键值
     */
    @Override
    protected Serializable pkVal() {
        return this.id;
    }
}