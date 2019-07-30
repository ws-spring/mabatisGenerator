package com.dong.bean;

import java.util.Date;

public class PhoneNum {
    /**
     * 主键id
     */
    private Long id;

    /**
     * 人员id
     */
    private Long personId;

    /**
     * 手机号码
     */
    private String phoneNum;

    /**
     * 拥有号码时间
     */
    private Date ownDate;

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
     * 手机号码
     * @return PHONE_NUM 手机号码
     */
    public String getPhoneNum() {
        return phoneNum;
    }

    /**
     * 手机号码
     * @param phoneNum 手机号码
     */
    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    /**
     * 拥有号码时间
     * @return OWN_DATE 拥有号码时间
     */
    public Date getOwnDate() {
        return ownDate;
    }

    /**
     * 拥有号码时间
     * @param ownDate 拥有号码时间
     */
    public void setOwnDate(Date ownDate) {
        this.ownDate = ownDate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", personId=").append(personId);
        sb.append(", phoneNum=").append(phoneNum);
        sb.append(", ownDate=").append(ownDate);
        sb.append("]");
        return sb.toString();
    }
}