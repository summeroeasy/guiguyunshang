package com.itguigu.auth;

import com.atguigu.model.system.SysRole;
import com.itguigu.auth.service.SysRoleService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class TestMPDemo2 {
    @Autowired
    private SysRoleService service;

    @Test
    public void testSelectList() {
        List<SysRole> list = service.list();
        list.forEach(System.out::println);
    }
}
