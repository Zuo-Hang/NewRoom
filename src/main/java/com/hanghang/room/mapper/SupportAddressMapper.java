package com.hanghang.room.mapper;

import com.hanghang.room.bin.SupportAddress;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface SupportAddressMapper {
    //获取所有行政级别的信息
    @Select("SELECT * FROM support_address WHERE level=#{level}")
    @Results({
            @Result(id=true,column="id",property="id"),
            @Result(column="belong_to",property="belongTo"),
            @Result(column="en_name",property="enName"),
            @Result(column="cn_name",property="cnName"),
            @Result(column="level",property="level"),
            @Result(column="baidu_map_lng",property="baiduMapLongitude"),
            @Result(column="baidu_map_lat",property="baiduMapLatitude")
    })
    List<SupportAddress> findAllByLevel(String level);


    //获取指定城市的所有区
    @Select("SELECT * FROM support_address WHERE belong_to=#{belongTo} AND level=#{level}")
    @Results({
            @Result(id=true,column="id",property="id"),
            @Result(column="belong_to",property="belongTo"),
            @Result(column="en_name",property="enName"),
            @Result(column="cn_name",property="cnName"),
            @Result(column="level",property="level"),
            @Result(column="baidu_map_lng",property="baiduMapLongitude"),
            @Result(column="baidu_map_lat",property="baiduMapLatitude")
    })
    List<SupportAddress> findAllByLevelAndBelongTo(@Param("level")String level,@Param("belongTo")String belongTo);
    //Mybatis的参数绑定，若发生：org.apache.ibatis.binding.BindingException: Parameter 'belongTo' not found. Available parameters are [arg1, arg0, param1, param2]，则需要绑定参数。

}
