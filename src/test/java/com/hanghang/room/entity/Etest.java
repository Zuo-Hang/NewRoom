package com.hanghang.room.entity;

import com.hanghang.room.ApplicationTests;
import com.hanghang.room.bin.User;
import com.hanghang.room.mapper.UserMapper;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class Etest extends ApplicationTests {
    @Autowired
    private UserMapper um;

    @Test
    public void testFindOne() {
        User E=um.gitUserById(1L);
        System.out.println(E);
    }
}















