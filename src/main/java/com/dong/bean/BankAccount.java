package com.dong.bean;

public class BankAccount {
    /**
     * null
     */
    private Long id;

    /**
     * 人员id
     */
    private Long personId;

    /**
     * 打电话id
     */
    private String 银行账号;

    /**
     * 接电话id
     */
    private String 开户行;

    /**
     * null
     * @return ID null
     */
    public Long getId() {
        return id;
    }

    /**
     * null
     * @param id null
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
     * 打电话id
     * @return 银行账号 打电话id
     */
    public String get银行账号() {
        return 银行账号;
    }

    /**
     * 打电话id
     * @param 银行账号 打电话id
     */
    public void set银行账号(String 银行账号) {
        this.银行账号 = 银行账号;
    }

    /**
     * 接电话id
     * @return 开户行 接电话id
     */
    public String get开户行() {
        return 开户行;
    }

    /**
     * 接电话id
     * @param 开户行 接电话id
     */
    public void set开户行(String 开户行) {
        this.开户行 = 开户行;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", personId=").append(personId);
        sb.append(", 银行账号=").append(银行账号);
        sb.append(", 开户行=").append(开户行);
        sb.append("]");
        return sb.toString();
    }
}