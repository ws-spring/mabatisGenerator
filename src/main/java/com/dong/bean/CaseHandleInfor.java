package com.dong.bean;

public class CaseHandleInfor {
    /**
     * 主键id
     */
    private Long id;

    /**
     * 案件id
     */
    private Long caseId;

    /**
     * 被处理人或者处理公司id
     */
    private Long handleObjId;

    /**
     * 处理信息
     */
    private String handleInfor;

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
     * 被处理人或者处理公司id
     * @return HANDLE_OBJ_ID 被处理人或者处理公司id
     */
    public Long getHandleObjId() {
        return handleObjId;
    }

    /**
     * 被处理人或者处理公司id
     * @param handleObjId 被处理人或者处理公司id
     */
    public void setHandleObjId(Long handleObjId) {
        this.handleObjId = handleObjId;
    }

    /**
     * 处理信息
     * @return HANDLE_INFOR 处理信息
     */
    public String getHandleInfor() {
        return handleInfor;
    }

    /**
     * 处理信息
     * @param handleInfor 处理信息
     */
    public void setHandleInfor(String handleInfor) {
        this.handleInfor = handleInfor;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", caseId=").append(caseId);
        sb.append(", handleObjId=").append(handleObjId);
        sb.append(", handleInfor=").append(handleInfor);
        sb.append("]");
        return sb.toString();
    }
}