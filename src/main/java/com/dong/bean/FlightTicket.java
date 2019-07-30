package com.dong.bean;

public class FlightTicket {
    /**
     * 主键id
     */
    private Long id;

    /**
     * 订票人id
     */
    private Long personId;

    /**
     * 航班开通id
     */
    private String schduleId;

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
     * 订票人id
     * @return PERSON_ID 订票人id
     */
    public Long getPersonId() {
        return personId;
    }

    /**
     * 订票人id
     * @param personId 订票人id
     */
    public void setPersonId(Long personId) {
        this.personId = personId;
    }

    /**
     * 航班开通id
     * @return SCHDULE_ID 航班开通id
     */
    public String getSchduleId() {
        return schduleId;
    }

    /**
     * 航班开通id
     * @param schduleId 航班开通id
     */
    public void setSchduleId(String schduleId) {
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