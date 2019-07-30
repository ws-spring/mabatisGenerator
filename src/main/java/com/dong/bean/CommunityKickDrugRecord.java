package com.dong.bean;

public class CommunityKickDrugRecord {
    /**
     * 主键id
     */
    private Long id;

    /**
     * 戒毒所id
     */
    private Long centerId;

    /**
     * 人员id
     */
    private Long personId;

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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", centerId=").append(centerId);
        sb.append(", personId=").append(personId);
        sb.append("]");
        return sb.toString();
    }
}