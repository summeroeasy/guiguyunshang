package com.itguigu.auth.service.impl;

import com.atguigu.model.system.SysRole;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.itguigu.auth.mapper.SysRoleMapper;
import com.itguigu.auth.service.SysRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SysRoleServiceImpl extends ServiceImpl<SysRoleMapper, SysRole> implements SysRoleService {
//    @Autowired
//    private SysRoleMapper sysRoleMapper;
}
