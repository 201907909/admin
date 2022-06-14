package com.admin.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName t_bus_goods
 */
@TableName(value ="t_bus_goods")
@Data
public class TBusGoods implements Serializable {
    /**
     * 
     */
    @TableId
    private Integer id;

    /**
     * 
     */
    private String no;

    /**
     * 
     */
    private String name;

    /**
     * 
     */
    private Double price;

    /**
     * 
     */
    private String model;

    /**
     * 
     */
    private String unit;

    /**
     * 
     */
    private Double weight;

    /**
     * 
     */
    private String pic;

    /**
     * 
     */
    private String remark;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}