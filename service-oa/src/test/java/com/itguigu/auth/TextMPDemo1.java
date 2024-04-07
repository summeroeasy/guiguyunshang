package com.itguigu.auth;

import com.atguigu.model.system.SysRole;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.itguigu.auth.mapper.SysRoleMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;

@SpringBootTest
public class TextMPDemo1 {

    @Resource
    private SysRoleMapper sysRoleMapper;

    @Test
    public void getAll() {
        sysRoleMapper.selectList(null);
    }

    @Test
    public void insert() {
        SysRole sysRole = new SysRole();
        sysRole.setRoleName("张三");
        sysRole.setRoleCode("SYSTEM");
        sysRole.setDescription("普通管理员");
        sysRoleMapper.insert(sysRole);
    }

    @Test
    public void update() {
        SysRole sysRole = new SysRole();
        sysRole.setId(9L);
        sysRole.setRoleName("李四");
        sysRoleMapper.updateById(sysRole);
    }

    @Test
    public void delete() {
        SysRole sysRole = new SysRole();
        sysRole.setId(9L);
        sysRoleMapper.deleteById(sysRole);
    }

    @Test
    public void testDeleteBatchIds() {
        int result = sysRoleMapper.deleteBatchIds(Arrays.asList(1, 1));
        System.out.println(result);
    }

    @Test
    public void testQuery1() {
        //创建QueryWrapper对象,调用方法封装条件
        QueryWrapper<SysRole> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("role_name", "系统管理员");
        //调用mp方法实现查询操作
        List<SysRole> sysRoles = sysRoleMapper.selectList(queryWrapper);
        System.out.println(sysRoles);
    }

    @Test
    public void testQuery2(){
        LambdaQueryWrapper<SysRole> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(SysRole::getRoleCode,"SYSTEM");
        sysRoleMapper.selectList(queryWrapper);
    }
}
