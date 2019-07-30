package com.dong.bean;

import java.util.Date;

public class PassengerDepartureRecord {
    /**
     * 主键id
     */
    private Long id;

    /**
     * 客运班次id
     */
    private Long passengerNumId;

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
     * 客运班次id
     * @return PASSENGER_NUM_ID 客运班次id
     */
    public Long getPassengerNumId() {
        return passengerNumId;
    }

    /**
     * 客运班次id
     * @param passengerNumId 客运班次id
     */
    public void setPassengerNumId(Long passengerNumId) {
        this.passengerNumId = passengerNumId;
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
        sb.append(", passengerNumId=").append(passengerNumId);
        sb.append(", startTime=").append(startTime);
        sb.append("]");
        return sb.toString();
    }
}