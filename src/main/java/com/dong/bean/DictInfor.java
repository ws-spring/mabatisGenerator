package com.dong.bean;

public class DictInfor {
    /**
     * 主键id
     */
    private Integer id;

    /**
     * 类别id
     */
    private Integer typeId;

    /**
     * 类别名称
     */
    private String typeName;

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
     * 类别id
     * @return TYPE_ID 类别id
     */
    public Integer getTypeId() {
        return typeId;
    }

    /**
     * 类别id
     * @param typeId 类别id
     */
    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    /**
     * 类别名称
     * @return TYPE_NAME 类别名称
     */
    public String getTypeName() {
        return typeName;
    }

    /**
     * 类别名称
     * @param typeName 类别名称
     */
    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", typeId=").append(typeId);
        sb.append(", typeName=").append(typeName);
        sb.append("]");
        return sb.toString();
    }
}