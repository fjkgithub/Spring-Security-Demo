package com.spring.security.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.gitee.sunchenbin.mybatis.actable.annotation.Column;
import com.gitee.sunchenbin.mybatis.actable.annotation.IsAutoIncrement;
import com.gitee.sunchenbin.mybatis.actable.annotation.IsKey;
import com.gitee.sunchenbin.mybatis.actable.annotation.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.io.Serializable;

/**
 * 用户表(SysUser)实体类
 *
 * @author makejava
 * @since 2019-09-03 15:06:48
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "sys_user")
@TableName(value = "sys_user")
public class SysUser implements Serializable {
    private static final long serialVersionUID = 915478504870211231L;
    @TableId(value = "id",type = IdType.AUTO)
    @IsKey
    @IsAutoIncrement
    @Column(name = "id",comment = "主键")
    private Integer id;
    //账号
    @TableField(value = "account")
    @Column(name = "account",comment = "请求路径id")
    private String account;
    //用户名
    @TableField(value = "user_name")
    @Column(name = "user_name",comment = "请求路径id")
    private String userName;
    //用户密码
    @TableField(value = "password")
    @Column(name = "password",comment = "请求路径id")
    private String password;
    //上一次登录时间
    @TableField(value = "last_login_time")
    @Column(name = "last_login_time",comment = "请求路径id")
    private Date lastLoginTime;
    //账号是否可用。默认为1（可用）
    @TableField(value = "enabled")
    @Column(name = "enabled",comment = "请求路径id")
    private Boolean enabled;
    //是否过期。默认为1（没有过期）
    @TableField(value = "account_non_expired")
    @Column(name = "account_non_expired",comment = "请求路径id")
    private Boolean accountNonExpired;
    //账号是否锁定。默认为1（没有锁定）
    @TableField(value = "account_non_locked")
    @Column(name = "account_non_locked",comment = "请求路径id")
    private Boolean accountNonLocked;
    //证书（密码）是否过期。默认为1（没有过期）
    @TableField(value = "credentials_non_expired")
    @Column(name = "credentials_non_expired",comment = "请求路径id")
    private Boolean credentialsNonExpired;
    //创建时间
    @TableField(value = "create_time")
    @Column(name = "create_time",comment = "请求路径id")
    private Date createTime;
    //修改时间
    @TableField(value = "update_time")
    @Column(name = "update_time",comment = "请求路径id")
    private Date updateTime;
    //创建人
    @TableField(value = "create_user")
    @Column(name = "create_user",comment = "请求路径id")
    private Integer createUser;
    //修改人
    @TableField(value = "update_user")
    @Column(name = "update_user",comment = "请求路径id")
    private Integer updateUser;

}