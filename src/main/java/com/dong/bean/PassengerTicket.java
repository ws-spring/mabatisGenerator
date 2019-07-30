package com.dong.bean;

public class PassengerTicket {
    /**
     * 主键id
     */
    private Long id;

    /**
     * 人员id
     */
    private Long personId;

    /**
     * 客运班次id
     */
    private Long schduleId;

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
     * 客运班次id
     * @return SCHDULE_ID 客运班次id
     */
    public Long getSchduleId() {
        return schduleId;
    }

    /**
     * 客运班次id
     * @param schduleId 客运班次id
     */
    public void setSchduleId(Long schduleId) {
        this.schduleId = schduleId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", personId=").append(personId);
        sb.append(", schduleId=").append(schduleId);
        sb.append("]");
        return sb.toString();
    }
}