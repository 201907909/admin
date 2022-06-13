package com.admin.service;

import com.admin.entity.TBaseRole;
import com.baomidou.mybatisplus.extension.service.IService;
import org.apache.ibatis.annotations.Mapper;

/**
* @author 陈同学
* @description 针对表【t_base_role】的数据库操作Service
* @createDate 2022-06-12 22:43:55
*/

public interface TBaseRoleService extends IService<TBaseRole> {

    public TBaseRole findById(Long id);
}
