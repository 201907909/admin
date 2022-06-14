package com.admin.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * @TableName t_sys_dictionary
 */
@TableName(value ="t_sys_dictionary")
@Data
public class TSysDictionary implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 
     */
    private Date createTime;

    /**
     * 
     */
    private String createUser;

    /**
     * 
     */
    private Integer status;

    /**
     * 
     */
    private Date updateTime;

    /**
     * 
     */
    private String updateUser;

    /**
     * 
     */
    private Integer version;

    /**
     * 
     */
    private String code;

    /**
     * 
     */
    private String name;

    /**
     * 
     */
    private Integer orderNo;

    /**
     * 
     */
    private String remark;

    /**
     * 
     */
    private String dictionarytypeCode;

    /**
     * 
     */
    private String parentCode;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}