package com.hanghang.room.mapper;

import com.hanghang.room.bin.User;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

public interface UserMapper {

    @Select("SELECT * FROM user WHERE id=#{id}")
    @Results({
            @Result(id=true,column="id",property="id"),
            @Result(column="grade_name",property="gradeName")
    })
    public User gitUserById (Long id);
}
