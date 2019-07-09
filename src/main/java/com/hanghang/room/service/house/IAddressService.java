package com.hanghang.room.service.house;

import com.hanghang.room.bin.SupportAddress;
import com.hanghang.room.service.ServiceMultiResult;
import com.hanghang.room.web.dto.SubwayDTO;
import com.hanghang.room.web.dto.SubwayStationDTO;
import com.hanghang.room.web.dto.SupportAddressDTO;

import java.util.List;
import java.util.Map;


/**
 * 地址服务接口
 */
public interface IAddressService {
    ServiceMultiResult<SupportAddressDTO> findAllCities();

    ServiceMultiResult findAllRegionsByCityName(String cityName);

    List<SubwayDTO> findAllSubwayByCity(String cityEnName);

    List<SubwayStationDTO> findAllStationBySubway(Long subwayId);

    Map<SupportAddress.Level, SupportAddressDTO> findCityAndRegion(String cityEnName, String regionEnName);
}
