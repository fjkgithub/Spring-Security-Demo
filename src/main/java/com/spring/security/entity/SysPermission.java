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

import java.io.Serializable;

/**
 * 权限表(SysPermission)实体类
 *
 * @author makejava
 * @since 2019-08-29 21:13:29
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "sys_permission")
@TableName(value = "sys_permission")
public class SysPermission implements Serializable {
    private static final long serialVersionUID = -71969734644822184L;
    //主键id
    @TableId(value = "id",type = IdType.AUTO)
    @IsKey
    @IsAutoIncrement
    @Column(name = "id",comment = "主键")
    private Integer id;
    //权限code
    @TableField(value = "permission_code")
    @Column(name = "permission_code",comment = "名称",isNull = false)
    private String permissionCode;
    //权限名
    @TableField(value = "permission_name")
    @Column(name = "permission_name",comment = "权限名")
    private String permissionName;

}