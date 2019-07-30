package com.dong.bean;

import java.util.Date;

public class Company {
    /**
     * 主键id
     */
    private Long id;

    /**
     * 公司名称
     */
    private String companyName;

    /**
     * 地址id
     */
    private Long addId;

    /**
     * 注册时间
     */
    private Date registDate;

    /**
     * 公司类型(字典id)
     */
    private Integer dictId;

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
     * 公司名称
     * @return COMPANY_NAME 公司名称
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * 公司名称
     * @param companyName 公司名称
     */
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    /**
     * 地址id
     * @return ADD_ID 地址id
     */
    public Long getAddId() {
        return addId;
    }

    /**
     * 地址id
     * @param addId 地址id
     */
    public void setAddId(Long addId) {
        this.addId = addId;
    }

    /**
     * 注册时间
     * @return REGIST_DATE 注册时间
     */
    public Date getRegistDate() {
        return registDate;
    }

    /**
     * 注册时间
     * @param registDate 注册时间
     */
    public void setRegistDate(Date registDate) {
        this.registDate = registDate;
    }

    /**
     * 公司类型(字典id)
     * @return DICT_ID 公司类型(字典id)
     */
    public Integer getDictId() {
        return dictId;
    }

    /**
     * 公司类型(字典id)
     * @param dictId 公司类型(字典id)
     */
    public void setDictId(Integer dictId) {
        this.dictId = dictId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", companyName=").append(companyName);
        sb.append(", addId=").append(addId);
        sb.append(", registDate=").append(registDate);
        sb.append(", dictId=").append(dictId);
        sb.append("]");
        return sb.toString();
    }
}