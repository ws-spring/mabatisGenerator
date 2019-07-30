package com.dong.bean;

import java.util.Date;

public class Person {
    /**
     * 主键id
     */
    private Long id;

    /**
     * 名字
     */
    private String name;

    /**
     * 身份证
     */
    private String cardId;

    /**
     * 婚姻状况
     */
    private String isMarried;

    /**
     * 父亲id
     */
    private Long dadId;

    /**
     * 母亲id
     */
    private Long momId;

    /**
     * 配偶id
     */
    private Long consortId;

    /**
     * 结婚时间
     */
    private Date marryDate;

    /**
     * 出生日期
     */
    private Date birthDate;

    /**
     * 性别
     */
    private String sexId;

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
     * 名字
     * @return NAME 名字
     */
    public String getName() {
        return name;
    }

    /**
     * 名字
     * @param name 名字
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 身份证
     * @return CARD_ID 身份证
     */
    public String getCardId() {
        return cardId;
    }

    /**
     * 身份证
     * @param cardId 身份证
     */
    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    /**
     * 婚姻状况
     * @return IS_MARRIED 婚姻状况
     */
    public String getIsMarried() {
        return isMarried;
    }

    /**
     * 婚姻状况
     * @param isMarried 婚姻状况
     */
    public void setIsMarried(String isMarried) {
        this.isMarried = isMarried;
    }

    /**
     * 父亲id
     * @return DAD_ID 父亲id
     */
    public Long getDadId() {
        return dadId;
    }

    /**
     * 父亲id
     * @param dadId 父亲id
     */
    public void setDadId(Long dadId) {
        this.dadId = dadId;
    }

    /**
     * 母亲id
     * @return MOM_ID 母亲id
     */
    public Long getMomId() {
        return momId;
    }

    /**
     * 母亲id
     * @param momId 母亲id
     */
    public void setMomId(Long momId) {
        this.momId = momId;
    }

    /**
     * 配偶id
     * @return CONSORT_ID 配偶id
     */
    public Long getConsortId() {
        return consortId;
    }

    /**
     * 配偶id
     * @param consortId 配偶id
     */
    public void setConsortId(Long consortId) {
        this.consortId = consortId;
    }

    /**
     * 结婚时间
     * @return MARRY_DATE 结婚时间
     */
    public Date getMarryDate() {
        return marryDate;
    }

    /**
     * 结婚时间
     * @param marryDate 结婚时间
     */
    public void setMarryDate(Date marryDate) {
        this.marryDate = marryDate;
    }

    /**
     * 出生日期
     * @return BIRTH_DATE 出生日期
     */
    public Date getBirthDate() {
        return birthDate;
    }

    /**
     * 出生日期
     * @param birthDate 出生日期
     */
    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    /**
     * 性别
     * @return SEX_ID 性别
     */
    public String getSexId() {
        return sexId;
    }

    /**
     * 性别
     * @param sexId 性别
     */
    public void setSexId(String sexId) {
        this.sexId = sexId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", cardId=").append(cardId);
        sb.append(", isMarried=").append(isMarried);
        sb.append(", dadId=").append(dadId);
        sb.append(", momId=").append(momId);
        sb.append(", consortId=").append(consortId);
        sb.append(", marryDate=").append(marryDate);
        sb.append(", birthDate=").append(birthDate);
        sb.append(", sexId=").append(sexId);
        sb.append("]");
        return sb.toString();
    }
}