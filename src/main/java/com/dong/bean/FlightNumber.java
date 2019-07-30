package com.dong.bean;

public class FlightNumber {
    /**
     * 主键id
     */
    private Long id;

    /**
     * 航班号
     */
    private String flightNum;

    /**
     * 起点城市编号
     */
    private Long sourceCity;

    /**
     * 终点城市编号
     */
    private Long targetCity;

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
     * 航班号
     * @return FLIGHT_NUM 航班号
     */
    public String getFlightNum() {
        return flightNum;
    }

    /**
     * 航班号
     * @param flightNum 航班号
     */
    public void setFlightNum(String flightNum) {
        this.flightNum = flightNum;
    }

    /**
     * 起点城市编号
     * @return SOURCE_CITY 起点城市编号
     */
    public Long getSourceCity() {
        return sourceCity;
    }

    /**
     * 起点城市编号
     * @param sourceCity 起点城市编号
     */
    public void setSourceCity(Long sourceCity) {
        this.sourceCity = sourceCity;
    }

    /**
     * 终点城市编号
     * @return TARGET_CITY 终点城市编号
     */
    public Long getTargetCity() {
        return targetCity;
    }

    /**
     * 终点城市编号
     * @param targetCity 终点城市编号
     */
    public void setTargetCity(Long targetCity) {
        this.targetCity = targetCity;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", flightNum=").append(flightNum);
        sb.append(", sourceCity=").append(sourceCity);
        sb.append(", targetCity=").append(targetCity);
        sb.append("]");
        return sb.toString();
    }
}