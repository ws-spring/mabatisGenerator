package com.dong.dao;

import com.dong.bean.PassengerDepartureRecord;

public interface PassengerDepartureRecordMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PassengerDepartureRecord record);

    int insertSelective(PassengerDepartureRecord record);

    PassengerDepartureRecord selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PassengerDepartureRecord record);

    int updateByPrimaryKey(PassengerDepartureRecord record);
}