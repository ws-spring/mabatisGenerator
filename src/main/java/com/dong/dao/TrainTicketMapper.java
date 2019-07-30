package com.dong.dao;

import com.dong.bean.TrainTicket;

public interface TrainTicketMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TrainTicket record);

    int insertSelective(TrainTicket record);

    TrainTicket selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TrainTicket record);

    int updateByPrimaryKey(TrainTicket record);
}