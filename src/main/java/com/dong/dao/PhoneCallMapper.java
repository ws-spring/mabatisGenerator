package com.dong.dao;

import com.dong.bean.PhoneCall;

public interface PhoneCallMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PhoneCall record);

    int insertSelective(PhoneCall record);

    PhoneCall selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PhoneCall record);

    int updateByPrimaryKey(PhoneCall record);
}