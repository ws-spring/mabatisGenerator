package com.dong.bean;

public class Express {
    /**
     * 主键id
     */
    private Long id;

    /**
     * 寄件人
     */
    private Long senderPersonId;

    /**
     * 收件人
     */
    private Long receiverPersonId;

    /**
     * 寄件地
     */
    private Long sCityCode;

    /**
     * 收件地
     */
    private Long rCityCode;

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
     * 寄件人
     * @return SENDER_PERSON_ID 寄件人
     */
    public Long getSenderPersonId() {
        return senderPersonId;
    }

    /**
     * 寄件人
     * @param senderPersonId 寄件人
     */
    public void setSenderPersonId(Long senderPersonId) {
        this.senderPersonId = senderPersonId;
    }

    /**
     * 收件人
     * @return RECEIVER_PERSON_ID 收件人
     */
    public Long getReceiverPersonId() {
        return receiverPersonId;
    }

    /**
     * 收件人
     * @param receiverPersonId 收件人
     */
    public void setReceiverPersonId(Long receiverPersonId) {
        this.receiverPersonId = receiverPersonId;
    }

    /**
     * 寄件地
     * @return S_CITY_CODE 寄件地
     */
    public Long getsCityCode() {
        return sCityCode;
    }

    /**
     * 寄件地
     * @param sCityCode 寄件地
     */
    public void setsCityCode(Long sCityCode) {
        this.sCityCode = sCityCode;
    }

    /**
     * 收件地
     * @return R_CITY_CODE 收件地
     */
    public Long getrCityCode() {
        return rCityCode;
    }

    /**
     * 收件地
     * @param rCityCode 收件地
     */
    public void setrCityCode(Long rCityCode) {
        this.rCityCode = rCityCode;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", senderPersonId=").append(senderPersonId);
        sb.append(", receiverPersonId=").append(receiverPersonId);
        sb.append(", sCityCode=").append(sCityCode);
        sb.append(", rCityCode=").append(rCityCode);
        sb.append("]");
        return sb.toString();
    }
}