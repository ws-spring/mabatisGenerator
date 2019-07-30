package com.dong.bean;

import java.util.Date;

public class DrugCase {
    /**
     * 主键id
     */
    private Long id;

    /**
     * 案件名称
     */
    private String caseName;

    /**
     * 公司地址id
     */
    private Long addrId;

    /**
     * 案发时间
     */
    private Date caseTime;

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
     * 案件名称
     * @return CASE_NAME 案件名称
     */
    public String getCaseName() {
        return caseName;
    }

    /**
     * 案件名称
     * @param caseName 案件名称
     */
    public void setCaseName(String caseName) {
        this.caseName = caseName;
    }

    /**
     * 公司地址id
     * @return ADDR_ID 公司地址id
     */
    public Long getAddrId() {
        return addrId;
    }

    /**
     * 公司地址id
     * @param addrId 公司地址id
     */
    public void setAddrId(Long addrId) {
        this.addrId = addrId;
    }

    /**
     * 案发时间
     * @return CASE_TIME 案发时间
     */
    public Date getCaseTime() {
        return caseTime;
    }

    /**
     * 案发时间
     * @param caseTime 案发时间
     */
    public void setCaseTime(Date caseTime) {
        this.caseTime = caseTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", caseName=").append(caseName);
        sb.append(", addrId=").append(addrId);
        sb.append(", caseTime=").append(caseTime);
        sb.append("]");
        return sb.toString();
    }
}