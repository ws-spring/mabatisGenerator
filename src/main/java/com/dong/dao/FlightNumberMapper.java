package com.dong.dao;

import com.dong.bean.FlightNumber;

public interface FlightNumberMapper {
    int deleteByPrimaryKey(Long id);

    int insert(FlightNumber record);

    int insertSelective(FlightNumber record);

    FlightNumber selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(FlightNumber record);

    int updateByPrimaryKey(FlightNumber record);
}