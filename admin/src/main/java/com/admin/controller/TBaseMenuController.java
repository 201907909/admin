package com.admin.controller;


import com.admin.common.lang.Result;
import com.admin.entity.TBaseMenu;
import com.admin.mapper.TBaseMenuMapper;
import com.admin.service.TBaseMenuService;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/menu")
public class TBaseMenuController {
    @Resource
    TBaseMenuService tBaseMenuService;
    @Resource
    TBaseMenuMapper tBaseMenuMapper;
    @GetMapping("/getMenus")
    public Result Menus(@RequestParam(defaultValue = "1") Integer currentPage) {
        Page page = new Page(currentPage, 3);
        IPage<TBaseMenu> pageData = tBaseMenuService.page(page, new QueryWrapper<TBaseMenu>().orderByAsc("ico"));
        return Result.succ(pageData);


    }


}
