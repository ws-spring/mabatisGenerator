package com.dong.bean;

public class City {
    /**
     * 城市区划编号
     */
    private Long cityCode;

    /**
     * 城市名称
     */
    private String cityName;

    /**
     * 城市区划编号
     * @return CITY_CODE 城市区划编号
     */
    public Long getCityCode() {
        return cityCode;
    }

    /**
     * 城市区划编号
     * @param cityCode 城市区划编号
     */
    public void setCityCode(Long cityCode) {
        this.cityCode = cityCode;
    }

    /**
     * 城市名称
     * @return CITY_NAME 城市名称
     */
    public String getCityName() {
        return cityName;
    }

    /**
     * 城市名称
     * @param cityName 城市名称
     */
    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", cityCode=").append(cityCode);
        sb.append(", cityName=").append(cityName);
        sb.append("]");
        return sb.toString();
    }
}