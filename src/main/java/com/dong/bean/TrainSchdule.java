package com.dong.bean;

public class TrainSchdule {
    /**
     * 主键id
     */
    private Long id;

    /**
     * 火车车次id
     */
    private Long trainNumId;

    /**
     * 出发时间
     */
    private Long startTime;

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
     * 火车车次id
     * @return TRAIN_NUM_ID 火车车次id
     */
    public Long getTrainNumId() {
        return trainNumId;
    }

    /**
     * 火车车次id
     * @param trainNumId 火车车次id
     */
    public void setTrainNumId(Long trainNumId) {
        this.trainNumId = trainNumId;
    }

    /**
     * 出发时间
     * @return START_TIME 出发时间
     */
    public Long getStartTime() {
        return startTime;
    }

    /**
     * 出发时间
     * @param startTime 出发时间
     */
    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", trainNumId=").append(trainNumId);
        sb.append(", startTime=").append(startTime);
        sb.append("]");
        return sb.toString();
    }
}