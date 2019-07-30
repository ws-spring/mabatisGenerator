package com.dong.dao;

import com.dong.bean.BankTrade;

public interface BankTradeMapper {
    int insert(BankTrade record);

    int insertSelective(BankTrade record);
}