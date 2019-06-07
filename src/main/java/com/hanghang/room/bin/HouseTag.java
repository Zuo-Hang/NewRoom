package com.hanghang.room.bin;

/**
 * 房源标签
 * Created by hanghang
 */
public class HouseTag {
    private Long id;
    private Long houseId;
    private String name;
    public HouseTag() {
    }

    public HouseTag(Long houseId, String name) {
        this.houseId = houseId;
        this.name = name;
    }

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "HouseTag{" +
                "id=" + id +
                ", houseId=" + houseId +
                ", name='" + name + '\'' +
                '}';
    }
}
