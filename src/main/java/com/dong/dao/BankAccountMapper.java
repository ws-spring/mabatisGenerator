package com.dong.dao;

import com.dong.bean.BankAccount;

public interface BankAccountMapper {
    int deleteByPrimaryKey(Long id);

    int insert(BankAccount record);

    int insertSelective(BankAccount record);

    BankAccount selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(BankAccount record);

    int updateByPrimaryKey(BankAccount record);
}