package com.dong.bean;

public class CasePersonRelation {
    /**
     * 主键id
     */
    private Long id;

    /**
     * 涉案人员id
     */
    private Long personId;

    /**
     * 案件id
     */
    private Long caseId;

    /**
     * 主键id
     */
    private Integer dicId;

    /**
     * 字典对应的名称：违法行为人关系/嫌疑人关系/证人关系
     */
    private String relationName;

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
     * 涉案人员id
     * @return PERSON_ID 涉案人员id
     */
    public Long getPersonId() {
        return personId;
    }

    /**
     * 涉案人员id
     * @param personId 涉案人员id
     */
    public void setPersonId(Long personId) {
        this.personId = personId;
    }

    /**
     * 案件id
     * @return CASE_ID 案件id
     */
    public Long getCaseId() {
        return caseId;
    }

    /**
     * 案件id
     * @param caseId 案件id
     */
    public void setCaseId(Long caseId) {
        this.caseId = caseId;
    }

    /**
     * 主键id
     * @return DIC_ID 主键id
     */
    public Integer getDicId() {
        return dicId;
    }

    /**
     * 主键id
     * @param dicId 主键id
     */
    public void setDicId(Integer dicId) {
        this.dicId = dicId;
    }

    /**
     * 字典对应的名称：违法行为人关系/嫌疑人关系/证人关系
     * @return RELATION_NAME 字典对应的名称：违法行为人关系/嫌疑人关系/证人关系
     */
    public String getRelationName() {
        return relationName;
    }

    /**
     * 字典对应的名称：违法行为人关系/嫌疑人关系/证人关系
     * @param relationName 字典对应的名称：违法行为人关系/嫌疑人关系/证人关系
     */
    public void setRelationName(String relationName) {
        this.relationName = relationName;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", personId=").append(personId);
        sb.append(", caseId=").append(caseId);
        sb.append(", dicId=").append(dicId);
        sb.append(", relationName=").append(relationName);
        sb.append("]");
        return sb.toString();
    }
}