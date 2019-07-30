package com.dong.bean;

public class KickDrugCenter {
    /**
     * 主键id
     */
    private Long id;

    /**
     * 戒毒所名称
     */
    private String name;

    /**
     * 地址
     */
    private String addr;

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
     * 戒毒所名称
     * @return NAME 戒毒所名称
     */
    public String getName() {
        return name;
    }

    /**
     * 戒毒所名称
     * @param name 戒毒所名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 地址
     * @return ADDR 地址
     */
    public String getAddr() {
        return addr;
    }

    /**
     * 地址
     * @param addr 地址
     */
    public void setAddr(String addr) {
        this.addr = addr;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", addr=").append(addr);
        sb.append("]");
        return sb.toString();
    }
}