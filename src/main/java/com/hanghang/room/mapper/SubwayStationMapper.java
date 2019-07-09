package com.hanghang.room.mapper;

import com.hanghang.room.bin.SubwayStation;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface SubwayStationMapper {
    @Select("SELECT * FROM subway_station WHERE subway_id=#{subwayId}")
    @Results({
            @Result(id=true,column="id",property="id"),
            @Result(column="subway_id",property="subwayId"),
            @Result(column="name",property="name")
    })
    public List<SubwayStation> findAllBySubwayId(Long subwayId);
}
