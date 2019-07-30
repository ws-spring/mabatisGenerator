package com.dong.dao;

import com.dong.bean.FlightTicket;

public interface FlightTicketMapper {
    int deleteByPrimaryKey(Long id);

    int insert(FlightTicket record);

    int insertSelective(FlightTicket record);

    FlightTicket selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(FlightTicket record);

    int updateByPrimaryKey(FlightTicket record);
}