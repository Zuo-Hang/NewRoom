package com.hanghang.room.mapper;


import com.hanghang.room.bin.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

//@Mapper或者@MapperScan将接口扫描装配到容器中

@Mapper
public interface EmployeeMapper {

    @Select("SELECT * FROM employee WHERE id=#{id}")
    public Employee getEmpById(Integer id);

    public void insertEmp(Employee employee);
}
