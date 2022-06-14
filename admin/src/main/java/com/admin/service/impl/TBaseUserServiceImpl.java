package com.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.admin.entity.TBaseUser;
import com.admin.service.TBaseUserService;
import com.admin.mapper.TBaseUserMapper;
import org.springframework.stereotype.Service;

/**
* @author 陈同学
* @description 针对表【t_base_user】的数据库操作Service实现
* @createDate 2022-06-13 22:44:19
*/
@Service
public class TBaseUserServiceImpl extends ServiceImpl<TBaseUserMapper, TBaseUser>
    implements TBaseUserService{

}




