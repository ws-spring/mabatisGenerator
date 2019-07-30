package com.dong.bean;

import java.util.Date;

public class BankTrade {
    /**
     * 主键id
     */
    private Long id;

    /**
     * 转出账户id
     */
    private Long outAccount;

    /**
     * 转入账户id
     */
    private Long inAccount;

    /**
     * 交易时间
     */
    private Date tradeTime;

    /**
     * 交易金额
     */
    private String money;

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
     * 转出账户id
     * @return OUT_ACCOUNT 转出账户id
     */
    public Long getOutAccount() {
        return outAccount;
    }

    /**
     * 转出账户id
     * @param outAccount 转出账户id
     */
    public void setOutAccount(Long outAccount) {
        this.outAccount = outAccount;
    }

    /**
     * 转入账户id
     * @return IN_ACCOUNT 转入账户id
     */
    public Long getInAccount() {
        return inAccount;
    }

    /**
     * 转入账户id
     * @param inAccount 转入账户id
     */
    public void setInAccount(Long inAccount) {
        this.inAccount = inAccount;
    }

    /**
     * 交易时间
     * @return TRADE_TIME 交易时间
     */
    public Date getTradeTime() {
        return tradeTime;
    }

    /**
     * 交易时间
     * @param tradeTime 交易时间
     */
    public void setTradeTime(Date tradeTime) {
        this.tradeTime = tradeTime;
    }

    /**
     * 交易金额
     * @return MONEY 交易金额
     */
    public String getMoney() {
        return money;
    }

    /**
     * 交易金额
     * @param money 交易金额
     */
    public void setMoney(String money) {
        this.money = money;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", outAccount=").append(outAccount);
        sb.append(", inAccount=").append(inAccount);
        sb.append(", tradeTime=").append(tradeTime);
        sb.append(", money=").append(money);
        sb.append("]");
        return sb.toString();
    }
}