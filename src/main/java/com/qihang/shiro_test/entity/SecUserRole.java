package com.qihang.shiro_test.entity;

import com.baomidou.mybatisplus.activerecord.Model;
import lombok.Data;

import java.io.Serializable;

/**
 * (SecUserRole)表实体类
 *
 * @author makejava
 * @since 2020-09-02 17:33:23
 */
@SuppressWarnings("serial")
@Data
public class SecUserRole extends Model<SecUserRole> {

    private Integer id;

    private Integer userId;

    private Integer roleId;

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