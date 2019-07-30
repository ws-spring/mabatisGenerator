package com.dong.dao;

import com.dong.bean.FlightSchdule;

public interface FlightSchduleMapper {
    int insert(FlightSchdule record);

    int insertSelective(FlightSchdule record);
}