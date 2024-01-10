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
 * 请求路径(SysRequestPath)实体类
 *
 * @author makejava
 * @since 2019-09-04 17:11:16
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "sys_request_path")
@TableName(value = "sys_request_path")
public class SysRequestPath implements Serializable {
    private static final long serialVersionUID = -38398465698914714L;
    //主键id
    @TableId(value = "id",type = IdType.AUTO)
    @IsKey
    @IsAutoIncrement
    @Column(name = "id",comment = "主键")
    private Integer id;
    //请求路径
    @TableField(value = "url")
    @Column(name = "url",comment = "请求路径")
    private String url;
    //路径描述
    @TableField(value = "description")
    @Column(name = "description",comment = "路径描述")
    private String description;

}