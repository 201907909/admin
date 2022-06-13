package com.admin.mapper;

import com.admin.entity.TBaseRole;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
* @author 陈同学
* @description 针对表【t_base_role】的数据库操作Mapper
* @createDate 2022-06-12 22:43:55
* @Entity com.admin.entity.TBaseRole
*/
@Mapper
public interface TBaseRoleMapper extends BaseMapper<TBaseRole> {

    public TBaseRole findBy(Long id);
}




