package com.hanghang.room.bin;

/**
 * Created by hanghang
 */
public class SupportAddress {
    private Long id;

    // 上一级行政单位
    private String belongTo;
    //城市缩写
    private String enName;
    //城市中文名
    private String cnName;
    //行政级别
    private String level;
    private double baiduMapLongitude;
    private double baiduMapLatitude;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBelongTo() {
        return belongTo;
    }

    public void setBelongTo(String belongTo) {
        this.belongTo = belongTo;
    }

    public String getEnName() {
        return enName;
    }

    public void setEnName(String enName) {
        this.enName = enName;
    }

    public String getCnName() {
        return cnName;
    }

    public void setCnName(String cnName) {
        this.cnName = cnName;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public double getBaiduMapLongitude() {
        return baiduMapLongitude;
    }

    public void setBaiduMapLongitude(double baiduMapLongitude) {
        this.baiduMapLongitude = baiduMapLongitude;
    }

    public double getBaiduMapLatitude() {
        return baiduMapLatitude;
    }

    public void setBaiduMapLatitude(double baiduMapLatitude) {
        this.baiduMapLatitude = baiduMapLatitude;
    }

    @Override
    public String toString() {
        return "SupportAddress{" +
                "id=" + id +
                ", belongTo='" + belongTo + '\'' +
                ", enName='" + enName + '\'' +
                ", cnName='" + cnName + '\'' +
                ", level='" + level + '\'' +
                ", baiduMapLongitude=" + baiduMapLongitude +
                ", baiduMapLatitude=" + baiduMapLatitude +
                '}';
    }

    /**
     * 行政级别定义
     */
    public enum Level {
        CITY("city"),//城市
        REGION("region");//区

        private String value;

        Level(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        public static Level of(String value) {
            for (Level level : Level.values()) {
                if (level.getValue().equals(value)) {
                    return level;
                }
            }

            throw new IllegalArgumentException();
        }
    }
}
