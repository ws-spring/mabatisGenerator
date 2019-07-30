package com.dong.bean;

import java.util.Date;

public class FlightSchdule {
    /**
     * 主键id
     */
    private Long id;

    /**
     * 航班号id
     */
    private Long flightNum;

    /**
     * 出发时间
     */
    private Date startTime;

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
     * 航班号id
     * @return FLIGHT_NUM 航班号id
     */
    public Long getFlightNum() {
        return flightNum;
    }

    /**
     * 航班号id
     * @param flightNum 航班号id
     */
    public void setFlightNum(Long flightNum) {
        this.flightNum = flightNum;
    }

    /**
     * 出发时间
     * @return START_TIME 出发时间
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * 出发时间
     * @param startTime 出发时间
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", flightNum=").append(flightNum);
        sb.append(", startTime=").append(startTime);
        sb.append("]");
        return sb.toString();
    }
}