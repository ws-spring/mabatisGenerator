package com.dong.bean;

public class Port {
    /**
     * 主键id  卡口id
     */
    private Long portId;

    /**
     * 卡口名称
     */
    private String portName;

    /**
     * 卡口地址
     */
    private String portAddr;

    /**
     * 主键id  卡口id
     * @return PORT_ID 主键id  卡口id
     */
    public Long getPortId() {
        return portId;
    }

    /**
     * 主键id  卡口id
     * @param portId 主键id  卡口id
     */
    public void setPortId(Long portId) {
        this.portId = portId;
    }

    /**
     * 卡口名称
     * @return PORT_NAME 卡口名称
     */
    public String getPortName() {
        return portName;
    }

    /**
     * 卡口名称
     * @param portName 卡口名称
     */
    public void setPortName(String portName) {
        this.portName = portName;
    }

    /**
     * 卡口地址
     * @return PORT_ADDR 卡口地址
     */
    public String getPortAddr() {
        return portAddr;
    }

    /**
     * 卡口地址
     * @param portAddr 卡口地址
     */
    public void setPortAddr(String portAddr) {
        this.portAddr = portAddr;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", portId=").append(portId);
        sb.append(", portName=").append(portName);
        sb.append(", portAddr=").append(portAddr);
        sb.append("]");
        return sb.toString();
    }
}