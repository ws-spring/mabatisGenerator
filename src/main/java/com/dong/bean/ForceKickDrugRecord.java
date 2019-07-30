package com.dong.bean;

import java.util.Date;

public class ForceKickDrugRecord {
    /**
     * 戒毒所id
     */
    private Long centerId;

    /**
     * 人员id
     */
    private Long personId;

    /**
     * 开始时间
     */
    private Date startDate;

    /**
     * 结束时间
     */
    private Date endDate;

    /**
     * 戒毒所id
     * @return CENTER_ID 戒毒所id
     */
    public Long getCenterId() {
        return centerId;
    }

    /**
     * 戒毒所id
     * @param centerId 戒毒所id
     */
    public void setCenterId(Long centerId) {
        this.centerId = centerId;
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
     * 开始时间
     * @return START_DATE 开始时间
     */
    public Date getStartDate() {
        return startDate;
    }

    /**
     * 开始时间
     * @param startDate 开始时间
     */
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    /**
     * 结束时间
     * @return END_DATE 结束时间
     */
    public Date getEndDate() {
        return endDate;
    }

    /**
     * 结束时间
     * @param endDate 结束时间
     */
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", centerId=").append(centerId);
        sb.append(", personId=").append(personId);
        sb.append(", startDate=").append(startDate);
        sb.append(", endDate=").append(endDate);
        sb.append("]");
        return sb.toString();
    }
}