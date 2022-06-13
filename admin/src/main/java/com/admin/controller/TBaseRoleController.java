package com.admin.controller;

import com.admin.entity.TBaseRole;
import com.admin.service.TBaseRoleService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/role")
public class TBaseRoleController {
    @Resource
    TBaseRoleService tBaseRoleService;
    @GetMapping("/tBaseRole")
    public TBaseRole select(long id){
        return tBaseRoleService.findById(id);
    }
}
