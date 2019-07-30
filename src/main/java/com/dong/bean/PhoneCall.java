package com.dong.bean;

import java.util.Date;

public class PhoneCall {
    /**
     * 主键id
     */
    private Long id;

    /**
     * 打电话id
     */
    private Long callNumId;

    /**
     * 接电话id
     */
    private Long calledNumId;

    /**
     * 通话开始时间
     */
    private Date startTime;

    /**
     * 通话结束时间
     */
    private Date endTime;

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
     * 打电话id
     * @return CALL_NUM_ID 打电话id
     */
    public Long getCallNumId() {
        return callNumId;
    }

    /**
     * 打电话id
     * @param callNumId 打电话id
     */
    public void setCallNumId(Long callNumId) {
        this.callNumId = callNumId;
    }

    /**
     * 接电话id
     * @return CALLED_NUM_ID 接电话id
     */
    public Long getCalledNumId() {
        return calledNumId;
    }

    /**
     * 接电话id
     * @param calledNumId 接电话id
     */
    public void setCalledNumId(Long calledNumId) {
        this.calledNumId = calledNumId;
    }

    /**
     * 通话开始时间
     * @return START_TIME 通话开始时间
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * 通话开始时间
     * @param startTime 通话开始时间
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * 通话结束时间
     * @return END_TIME 通话结束时间
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * 通话结束时间
     * @param endTime 通话结束时间
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", callNumId=").append(callNumId);
        sb.append(", calledNumId=").append(calledNumId);
        sb.append(", startTime=").append(startTime);
        sb.append(", endTime=").append(endTime);
        sb.append("]");
        return sb.toString();
    }
}