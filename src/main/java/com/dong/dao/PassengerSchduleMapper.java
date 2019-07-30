package com.dong.dao;

import com.dong.bean.PassengerSchdule;

public interface PassengerSchduleMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PassengerSchdule record);

    int insertSelective(PassengerSchdule record);

    PassengerSchdule selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PassengerSchdule record);

    int updateByPrimaryKey(PassengerSchdule record);
}