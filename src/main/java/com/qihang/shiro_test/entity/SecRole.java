package com.qihang.shiro_test.entity;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * (SecRole)表实体类
 *
 * @author makejava
 * @since 2020-09-02 17:33:21
 */
@SuppressWarnings("serial")
@Data
public class SecRole extends Model<SecRole> {

    private Integer id;

    private String name;

    @TableField(exist = false)
    private List<SecPermission> permissions;

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