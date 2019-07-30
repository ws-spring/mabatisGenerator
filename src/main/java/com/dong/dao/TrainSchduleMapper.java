package com.dong.dao;

import com.dong.bean.TrainSchdule;

public interface TrainSchduleMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TrainSchdule record);

    int insertSelective(TrainSchdule record);

    TrainSchdule selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TrainSchdule record);

    int updateByPrimaryKey(TrainSchdule record);
}