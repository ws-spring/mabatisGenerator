package com.dong.bean;

import java.util.Date;

public class HotelRecord {
    /**
     * 主键id
     */
    private Long id;

    /**
     * 旅店id
     */
    private Long companyId;

    /**
     * 人员id
     */
    private Long personId;

    /**
     * 入住时间
     */
    private Date inDate;

    /**
     * 离开时间
     */
    private Date outDate;

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
     * 旅店id
     * @return COMPANY_ID 旅店id
     */
    public Long getCompanyId() {
        return companyId;
    }

    /**
     * 旅店id
     * @param companyId 旅店id
     */
    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
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
     * 入住时间
     * @return IN_DATE 入住时间
     */
    public Date getInDate() {
        return inDate;
    }

    /**
     * 入住时间
     * @param inDate 入住时间
     */
    public void setInDate(Date inDate) {
        this.inDate = inDate;
    }

    /**
     * 离开时间
     * @return OUT_DATE 离开时间
     */
    public Date getOutDate() {
        return outDate;
    }

    /**
     * 离开时间
     * @param outDate 离开时间
     */
    public void setOutDate(Date outDate) {
        this.outDate = outDate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", companyId=").append(companyId);
        sb.append(", personId=").append(personId);
        sb.append(", inDate=").append(inDate);
        sb.append(", outDate=").append(outDate);
        sb.append("]");
        return sb.toString();
    }
}