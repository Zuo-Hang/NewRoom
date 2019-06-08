package com.hanghang.room.mapper;

import com.hanghang.room.bin.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {

    @Select("SELECT * FROM user WHERE id=#{id}")
    @Results({
            @Result(id=true,column="id",property="id"),
            @Result(column="name",property="name"),
            @Result(column="email",property="email"),
            @Result(column="phone_number",property="phoneNumber"),
            @Result(column="password",property="password"),
            @Result(column="status",property="status"),
            @Result(column="create_time",property="createTime"),
            @Result(column="last_login_time",property="lastLoginTime"),
            @Result(column="last_update_time",property="lastUpdateTime"),
            @Result(column="avatar",property="avatar")
    })
    User getUserById (Long id);

    @Select("SELECT * FROM user WHERE name=#{name}")
    @Results({
            @Result(id=true,column="id",property="id"),
            @Result(column="name",property="name"),
            @Result(column="email",property="email"),
            @Result(column="phone_number",property="phoneNumber"),
            @Result(column="password",property="password"),
            @Result(column="status",property="status"),
            @Result(column="create_time",property="createTime"),
            @Result(column="last_login_time",property="lastLoginTime"),
            @Result(column="last_update_time",property="lastUpdateTime"),
            @Result(column="avatar",property="avatar")
    })
    User getUserByName(String name);
}
