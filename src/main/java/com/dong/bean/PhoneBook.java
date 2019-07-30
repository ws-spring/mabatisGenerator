package com.dong.bean;

public class PhoneBook {
    /**
     * 主键id
     */
    private Long id;

    /**
     * 人员id
     */
    private Long personId;

    /**
     * 被存人员id
     */
    private Long savedPersonId;

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
     * 被存人员id
     * @return SAVED_PERSON_ID 被存人员id
     */
    public Long getSavedPersonId() {
        return savedPersonId;
    }

    /**
     * 被存人员id
     * @param savedPersonId 被存人员id
     */
    public void setSavedPersonId(Long savedPersonId) {
        this.savedPersonId = savedPersonId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", personId=").append(personId);
        sb.append(", savedPersonId=").append(savedPersonId);
        sb.append("]");
        return sb.toString();
    }
}