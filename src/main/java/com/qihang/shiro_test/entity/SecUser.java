package com.qihang.shiro_test.entity;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * (SecUser)表实体类
 *
 * @author makejava
 * @since 2020-09-02 17:33:22
 */
@SuppressWarnings("serial")
@Data
public class SecUser extends Model<SecUser> {

    private Integer id;

    private String username;

    private String password;

    @TableField(exist = false)
    private List<SecRole> roles;

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