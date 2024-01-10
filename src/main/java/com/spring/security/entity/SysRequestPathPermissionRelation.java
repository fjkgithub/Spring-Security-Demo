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
 * 路径权限关联表(SysRequestPathPermissionRelation)实体类
 *
 * @author makejava
 * @since 2019-09-04 17:11:53
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "sys_request_path_permission_relation")
@TableName(value = "sys_request_path_permission_relation")
public class SysRequestPathPermissionRelation implements Serializable {
    private static final long serialVersionUID = -59197738311147860L;
    //主键id
    @TableId(value = "id",type = IdType.AUTO)
    @IsKey
    @IsAutoIncrement
    @Column(name = "id",comment = "主键")
    private Integer id;
    //请求路径id
    @TableField(value = "url_id")
    @Column(name = "url_id",comment = "请求路径id")
    private Integer urlId;
    //权限id
    @TableField(value = "permission_id")
    @Column(name = "permission_id",comment = "权限id")
    private Integer permissionId;

}