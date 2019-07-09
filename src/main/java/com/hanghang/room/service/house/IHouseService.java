package com.hanghang.room.service.house;

import com.hanghang.room.service.ServiceResult;
import com.hanghang.room.web.dto.HouseDTO;
import com.hanghang.room.web.form.HouseForm;

public interface IHouseService {
    ServiceResult<HouseDTO> save(HouseForm houseForm);
}
