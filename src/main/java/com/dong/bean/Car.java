package com.dong.bean;

public class Car {
    /**
     * 主键id
     */
    private Long id;

    /**
     * 人员id
     */
    private Long personId;

    /**
     * 公司id
     */
    private Long companyId;

    /**
     * 车牌号
     */
    private String carPlateNum;

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
     * 车牌号
     * @return CAR_PLATE_NUM 车牌号
     */
    public String getCarPlateNum() {
        return carPlateNum;
    }

    /**
     * 车牌号
     * @param carPlateNum 车牌号
     */
    public void setCarPlateNum(String carPlateNum) {
        this.carPlateNum = carPlateNum;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", personId=").append(personId);
        sb.append(", companyId=").append(companyId);
        sb.append(", carPlateNum=").append(carPlateNum);
        sb.append("]");
        return sb.toString();
    }
}