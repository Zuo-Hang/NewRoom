package com.hanghang.room.mapper;

import com.hanghang.room.service.ServiceResult;
import com.hanghang.room.web.dto.HouseDTO;
import com.hanghang.room.web.form.HouseForm;
import org.apache.ibatis.annotations.Mapper;

/**
 * 房屋管理接口
 */
@Mapper
public interface HouseMapper {
    ServiceResult<HouseDTO> save(HouseForm houseForm);
}
