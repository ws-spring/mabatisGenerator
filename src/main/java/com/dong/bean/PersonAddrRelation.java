package com.dong.bean;

public class PersonAddrRelation {
    /**
     * 主键id
     */
    private Long id;

    /**
     * 地址id
     */
    private Long addrId;

    /**
     * 人员id
     */
    private Long personId;

    /**
     * 主键id
     */
    private Integer dicId;

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
     * 地址id
     * @return ADDR_ID 地址id
     */
    public Long getAddrId() {
        return addrId;
    }

    /**
     * 地址id
     * @param addrId 地址id
     */
    public void setAddrId(Long addrId) {
        this.addrId = addrId;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", addrId=").append(addrId);
        sb.append(", personId=").append(personId);
        sb.append(", dicId=").append(dicId);
        sb.append("]");
        return sb.toString();
    }
}