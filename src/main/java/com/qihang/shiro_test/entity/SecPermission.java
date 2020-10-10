package com.qihang.shiro_test.entity;

import com.baomidou.mybatisplus.activerecord.Model;
import lombok.Data;

import java.io.Serializable;

/**
 * (SecPermission)表实体类
 *
 * @author makejava
 * @since 2020-09-02 17:33:09
 */
@SuppressWarnings("serial")
@Data
public class SecPermission extends Model<SecPermission> {

    private Integer id;

    private String name;

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