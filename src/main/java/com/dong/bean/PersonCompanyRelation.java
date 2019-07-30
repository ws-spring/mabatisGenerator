package com.dong.bean;

import java.util.Date;

public class PersonCompanyRelation {
    /**
     * 主键id
     */
    private Long id;

    /**
     * 公司id
     */
    private Long companyId;

    /**
     * 人员id
     */
    private Long personId;

    /**
     * 主键id
     */
    private Integer dicId;

    /**
     * 所有人/工作处所/会员
     */
    private Integer dictId;

    /**
     * 关系时间
     */
    private Date relationDate;

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
     * 公司id
     * @return COMPANY_ID 公司id
     */
    public Long getCompanyId() {
        return companyId;
    }

    /**
     * 公司id
     * @param companyId 公司id
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
     * 主键id
     * @return DIC_ID 主键id
     */
    public Integer getDicId() {
        return dicId;
    }

    /**
     * 主键id
     * @param dicId 主键id
     */
    public void setDicId(Integer dicId) {
        this.dicId = dicId;
    }

    /**
     * 所有人/工作处所/会员
     * @return DICT_ID 所有人/工作处所/会员
     */
    public Integer getDictId() {
        return dictId;
    }

    /**
     * 所有人/工作处所/会员
     * @param dictId 所有人/工作处所/会员
     */
    public void setDictId(Integer dictId) {
        this.dictId = dictId;
    }

    /**
     * 关系时间
     * @return RELATION_DATE 关系时间
     */
    public Date getRelationDate() {
        return relationDate;
    }

    /**
     * 关系时间
     * @param relationDate 关系时间
     */
    public void setRelationDate(Date relationDate) {
        this.relationDate = relationDate;
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
        sb.append(", dicId=").append(dicId);
        sb.append(", dictId=").append(dictId);
        sb.append(", relationDate=").append(relationDate);
        sb.append("]");
        return sb.toString();
    }
}