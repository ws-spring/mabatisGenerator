package com.dong.dao;

import com.dong.bean.PassengerTicket;

public interface PassengerTicketMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PassengerTicket record);

    int insertSelective(PassengerTicket record);

    PassengerTicket selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PassengerTicket record);

    int updateByPrimaryKey(PassengerTicket record);
}