package com.hanghang.room.entity;

import com.hanghang.room.ApplicationTests;
import com.hanghang.room.bin.Employee;
import com.hanghang.room.mapper.EmployeeMapper;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class Etest extends ApplicationTests {
    @Autowired
    private EmployeeMapper Em;

    @Test
    public void testFindOne() {
        Employee E = Em.getEmpById(1);
        System.out.println(E);
    }

}
