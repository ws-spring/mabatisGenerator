package com.dong.bean;

import java.util.Date;

public class PersonPassPortRecord {
    /**
     * 主键id
     */
    private Long id;

    /**
     * 卡口id
     */
    private Long portCode;

    /**
     * 人员id
     */
    private Long personId;

    /**
     * 口岸id
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
     * 卡口id
     * @return PORT_CODE 卡口id
     */
    public Long getPortCode() {
        return portCode;
    }

    /**
     * 卡口id
     * @param portCode 卡口id
     */
    public void setPortCode(Long portCode) {
        this.portCode = portCode;
    }

    /**
     * 人员id
     * @return PERSON_ID 人员id
     */
    public Long getPersonId() {
        return personId;
    }

    /**
     * 人员id
     * @param personId 人员id
     */
    public void setPersonId(Long personId) {
        this.personId = personId;
    }

    /**
     * 口岸id
     * @return PORT_ID 口岸id
     */
    public Long getPortId() {
        return portId;
    }

    /**
     * 口岸id
     * @param portId 口岸id
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
        sb.append(", portCode=").append(portCode);
        sb.append(", personId=").append(personId);
        sb.append(", portId=").append(portId);
        sb.append(", passTime=").append(passTime);
        sb.append("]");
        return sb.toString();
    }
}