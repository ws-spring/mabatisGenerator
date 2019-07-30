package com.dong.bean;

public class Address {
    /**
     * 主键id
     */
    private Long id;

    /**
     * 详细地址
     */
    private String addrName;

    /**
     * 所属城市
     */
    private Integer cityCode;

    /**
     * 主键id
     * @return ID 主键id
     */
    public Long getId() {
        return id;
    }

    /**
     * 主键id
     * @param id 主键id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 详细地址
     * @return ADDR_NAME 详细地址
     */
    public String getAddrName() {
        return addrName;
    }

    /**
     * 详细地址
     * @param addrName 详细地址
     */
    public void setAddrName(String addrName) {
        this.addrName = addrName;
    }

    /**
     * 所属城市
     * @return CITY_CODE 所属城市
     */
    public Integer getCityCode() {
        return cityCode;
    }

    /**
     * 所属城市
     * @param cityCode 所属城市
     */
    public void setCityCode(Integer cityCode) {
        this.cityCode = cityCode;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", addrName=").append(addrName);
        sb.append(", cityCode=").append(cityCode);
        sb.append("]");
        return sb.toString();
    }
}