package com.dong.bean;

public class PassengerSchdule {
    /**
     * 主键id
     */
    private Long id;

    /**
     * 客运班次
     */
    private String passengerNum;

    /**
     * 起点城市
     */
    private Long sourceCity;

    /**
     * 终点城市
     */
    private Long targetCity;

    /**
     * 车辆id
     */
    private Long carId;

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
     * 客运班次
     * @return PASSENGER_NUM 客运班次
     */
    public String getPassengerNum() {
        return passengerNum;
    }

    /**
     * 客运班次
     * @param passengerNum 客运班次
     */
    public void setPassengerNum(String passengerNum) {
        this.passengerNum = passengerNum;
    }

    /**
     * 起点城市
     * @return SOURCE_CITY 起点城市
     */
    public Long getSourceCity() {
        return sourceCity;
    }

    /**
     * 起点城市
     * @param sourceCity 起点城市
     */
    public void setSourceCity(Long sourceCity) {
        this.sourceCity = sourceCity;
    }

    /**
     * 终点城市
     * @return TARGET_CITY 终点城市
     */
    public Long getTargetCity() {
        return targetCity;
    }

    /**
     * 终点城市
     * @param targetCity 终点城市
     */
    public void setTargetCity(Long targetCity) {
        this.targetCity = targetCity;
    }

    /**
     * 车辆id
     * @return CAR_ID 车辆id
     */
    public Long getCarId() {
        return carId;
    }

    /**
     * 车辆id
     * @param carId 车辆id
     */
    public void setCarId(Long carId) {
        this.carId = carId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", passengerNum=").append(passengerNum);
        sb.append(", sourceCity=").append(sourceCity);
        sb.append(", targetCity=").append(targetCity);
        sb.append(", carId=").append(carId);
        sb.append("]");
        return sb.toString();
    }
}