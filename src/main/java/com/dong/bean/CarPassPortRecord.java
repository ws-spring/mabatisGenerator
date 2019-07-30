package com.dong.bean;

import java.util.Date;

public class CarPassPortRecord {
    /**
     * 主键id
     */
    private Long id;

    /**
     * 车辆id
     */
    private Long cardId;

    /**
     * 卡口id
     */
    private Long portId;

    /**
     * 通过时间
     */
    private Date passTime;

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
     * 车辆id
     * @return CARD_ID 车辆id
     */
    public Long getCardId() {
        return cardId;
    }

    /**
     * 车辆id
     * @param cardId 车辆id
     */
    public void setCardId(Long cardId) {
        this.cardId = cardId;
    }

    /**
     * 卡口id
     * @return PORT_ID 卡口id
     */
    public Long getPortId() {
        return portId;
    }

    /**
     * 卡口id
     * @param portId 卡口id
     */
    public void setPortId(Long portId) {
        this.portId = portId;
    }

    /**
     * 通过时间
     * @return PASS_TIME 通过时间
     */
    public Date getPassTime() {
        return passTime;
    }

    /**
     * 通过时间
     * @param passTime 通过时间
     */
    public void setPassTime(Date passTime) {
        this.passTime = passTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", cardId=").append(cardId);
        sb.append(", portId=").append(portId);
        sb.append(", passTime=").append(passTime);
        sb.append("]");
        return sb.toString();
    }
}