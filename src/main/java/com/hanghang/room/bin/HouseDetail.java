package com.hanghang.room.bin;

public class HouseDetail {
    private Long id;
    private Long houseId;
    private String description;
    private String layoutDesc;
    private String traffic;
    private String roundService;
    private int rentWay;
    private String detailAddress;
    private Long subwayLineId;
    private Long subwayStationId;
    private String subwayLineName;
    private String subwayStationName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getHouseId() {
        return houseId;
    }

    public void setHouseId(Long houseId) {
        this.houseId = houseId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLayoutDesc() {
        return layoutDesc;
    }

    public void setLayoutDesc(String layoutDesc) {
        this.layoutDesc = layoutDesc;
    }

    public String getTraffic() {
        return traffic;
    }

    public void setTraffic(String traffic) {
        this.traffic = traffic;
    }

    public String getRoundService() {
        return roundService;
    }

    public void setRoundService(String roundService) {
        this.roundService = roundService;
    }

    public int getRentWay() {
        return rentWay;
    }

    public void setRentWay(int rentWay) {
        this.rentWay = rentWay;
    }

    public String getDetailAddress() {
        return detailAddress;
    }

    public void setDetailAddress(String detailAddress) {
        this.detailAddress = detailAddress;
    }

    public Long getSubwayLineId() {
        return subwayLineId;
    }

    public void setSubwayLineId(Long subwayLineId) {
        this.subwayLineId = subwayLineId;
    }

    public Long getSubwayStationId() {
        return subwayStationId;
    }

    public void setSubwayStationId(Long subwayStationId) {
        this.subwayStationId = subwayStationId;
    }

    public String getSubwayLineName() {
        return subwayLineName;
    }

    public void setSubwayLineName(String subwayLineName) {
        this.subwayLineName = subwayLineName;
    }

    public String getSubwayStationName() {
        return subwayStationName;
    }

    public void setSubwayStationName(String subwayStationName) {
        this.subwayStationName = subwayStationName;
    }

    @Override
    public String toString() {
        return "HouseDetail{" +
                "id=" + id +
                ", houseId=" + houseId +
                ", description='" + description + '\'' +
                ", layoutDesc='" + layoutDesc + '\'' +
                ", traffic='" + traffic + '\'' +
                ", roundService='" + roundService + '\'' +
                ", rentWay=" + rentWay +
                ", detailAddress='" + detailAddress + '\'' +
                ", subwayLineId=" + subwayLineId +
                ", subwayStationId=" + subwayStationId +
                ", subwayLineName='" + subwayLineName + '\'' +
                ", subwayStationName='" + subwayStationName + '\'' +
                '}';
    }
}
