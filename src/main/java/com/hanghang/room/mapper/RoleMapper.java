package com.hanghang.room.mapper;

import com.hanghang.room.bin.Role;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface RoleMapper {
    @Select("select * from role WHERE user_id=#{userId}")
    @Results({
            @Result(id=true,column="id",property="id"),
            @Result(column="user_id",property="userId"),
            @Result(column="name",property="name")
    })
    List<Role> findRolesByUserId(Long userId);
}
