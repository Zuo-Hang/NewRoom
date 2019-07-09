package com.hanghang.room.mapper;

import com.hanghang.room.bin.Subway;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface SubwayMapper {
    @Select("SELECT * FROM subway WHERE city_en_name=#{cityEnName}")
    @Results({
            @Result(id=true,column="id",property="id"),
            @Result(column="city_en_name",property="cityEnName"),
            @Result(column="name",property="name")
    })
    List<Subway> findAllByCityEnName(String cityEnName);
}
