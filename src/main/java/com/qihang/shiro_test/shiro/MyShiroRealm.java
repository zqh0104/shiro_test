package com.qihang.shiro_test.shiro;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.qihang.shiro_test.entity.*;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @Author: QiHangZhang
 * @Date: 2020/8/28 11:29
 * @Description:
 */
public class MyShiroRealm extends AuthorizingRealm {

    //角色权限和对应权限添加
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        //添加角色和权限
        SimpleAuthorizationInfo simpleAuthorizationInfo = new SimpleAuthorizationInfo();
        System.out.println(principalCollection.getPrimaryPrincipal());
        SecUser user= (SecUser) principalCollection.getPrimaryPrincipal();
        //保存所有角色名
        Set<String> allRoles = new HashSet<>();
        //保存所有权限名
        Set<String> allPermissions = new HashSet<>();
        //查询对应角色
        List<SecUserRole> secUserRoles = new SecUserRole().selectList(new EntityWrapper().eq("user_id", user.getId()));
        for (SecUserRole userRole:secUserRoles) {
            SecRole role = new SecRole();
            role.setId(userRole.getRoleId());
            role = role.selectById();
            allRoles.add(role.getName());

            //查询所有权限
            List<SecPermission> permissions = new ArrayList<>();
            List<SecRolePermission> rolePermissions = new SecRolePermission().selectList(new EntityWrapper().eq("role_id", role.getId()));
            for (SecRolePermission rolePermission:rolePermissions) {
                SecPermission permission = new SecPermission();
                permission.setId(rolePermission.getPermissionId());
                permission = permission.selectById();
                allPermissions.add(permission.getName());
            }
        }
        //添加角色
        simpleAuthorizationInfo.addRoles(allRoles);
        simpleAuthorizationInfo.addStringPermissions(allPermissions);


        System.out.println(user);

        return simpleAuthorizationInfo;
    }

    //用户认证
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        // 1、登录认证的方法需要先执行，需要用他来判断登录的用户信息是否合法
        String username = (String) token.getPrincipal();    // 取得用户名
        // 需要通过用户名取得用户的完整信息，利用业务层操作
        SecUser user = null;
        try {
            user = new SecUser().selectOne(new EntityWrapper().eq("username",username));
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (user == null) {
            throw new UnknownAccountException("该用户名称不存在！");
        } else {    // 进行密码的验证处理
            String password =new String((char[]) token.getCredentials());
            // 将数据库中的密码与输入的密码进行比较，这样就可以确定当前用户是否可以正常登录
            if (user.getPassword().equals(password)) {    // 密码正确

                AuthenticationInfo auth = new SimpleAuthenticationInfo(user, password, "memberRealm");
                return auth;
            } else {
                throw new IncorrectCredentialsException("密码错误！");
            }
        }
    }
}
