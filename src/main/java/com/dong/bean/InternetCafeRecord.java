package com.dong.bean;

import java.util.Date;

public class InternetCafeRecord {
    /**
     * null
     */
    private Long id;

    /**
     * 网吧id
     */
    private Long companyId;

    /**
     * 人员id
     */
    private Long addrId;

    /**
     * 开始时间
     */
    private Date startTime;

    /**
     * 结束时间
     */
    private Date endTime;

    /**
     * null
     * @return ID null
     */
    public Long getId() {
        return id;
    }

    /**
     * null
     * @param id null
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 网吧id
     * @return COMPANY_ID 网吧id
     */
    public Long getCompanyId() {
        return companyId;
    }

    /**
     * 网吧id
     * @param companyId 网吧id
     */
    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    /**
     * 人员id
     * @return ADDR_ID 人员id
     */
    public Long getAddrId() {
        return addrId;
    }

    /**
     * 人员id
     * @param addrId 人员id
     */
    public void setAddrId(Long addrId) {
        this.addrId = addrId;
    }

    /**
     * 开始时间
     * @return START_TIME 开始时间
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * 开始时间
     * @param startTime 开始时间
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * 结束时间
     * @return END_TIME 结束时间
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * 结束时间
     * @param endTime 结束时间
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", companyId=").append(companyId);
        sb.append(", addrId=").append(addrId);
        sb.append(", startTime=").append(startTime);
        sb.append(", endTime=").append(endTime);
        sb.append("]");
        return sb.toString();
    }
}