package com.hanghang.room.service.house;

import com.hanghang.room.service.ServiceResult;
import com.hanghang.room.web.dto.HouseDTO;
import com.hanghang.room.web.form.HouseForm;
import org.springframework.stereotype.Service;

@Service
public class HouseServiceImpl implements IHouseService {
    @Override
    public ServiceResult<HouseDTO> save(HouseForm houseForm) {
        return null;
    }
}
