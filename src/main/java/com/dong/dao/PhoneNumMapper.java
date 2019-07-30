package com.dong.dao;

import com.dong.bean.PhoneNum;

public interface PhoneNumMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PhoneNum record);

    int insertSelective(PhoneNum record);

    PhoneNum selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PhoneNum record);

    int updateByPrimaryKey(PhoneNum record);
}