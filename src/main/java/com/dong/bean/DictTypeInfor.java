package com.dong.bean;

public class DictTypeInfor {
    /**
     * 主键id
     */
    private Integer id;

    /**
     * 类别名称
     */
    private String name;

    /**
     * 主键id
     * @return ID 主键id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 主键id
     * @param id 主键id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 类别名称
     * @return NAME 类别名称
     */
    public String getName() {
        return name;
    }

    /**
     * 类别名称
     * @param name 类别名称
     */
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append("]");
        return sb.toString();
    }
}