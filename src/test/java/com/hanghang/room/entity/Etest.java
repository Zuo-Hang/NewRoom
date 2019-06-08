package com.hanghang.room.entity;

import com.hanghang.room.ApplicationTests;
import com.hanghang.room.bin.Role;
import com.hanghang.room.bin.User;
import com.hanghang.room.mapper.RoleMapper;
import com.hanghang.room.mapper.UserMapper;
import com.hanghang.room.service.user.UserServiceImpl;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class Etest extends ApplicationTests {
    @Autowired
    private UserMapper um;
    @Autowired
    private RoleMapper rm;


    @Test
    public void testFindOne() {
        User E=um.getUserById(1L);
        System.out.println(E);
    }

    @Test
    public void testFinduserService() {

        User E=um.getUserByName("admin");
        System.out.println(E);
    }

    @Test
    public void testrvice() {

        List<Role> E= rm.findRolesByUserId((long) 2);
        System.out.println(E);
    }
}















