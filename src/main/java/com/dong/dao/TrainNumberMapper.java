package com.dong.dao;

import com.dong.bean.TrainNumber;

public interface TrainNumberMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TrainNumber record);

    int insertSelective(TrainNumber record);

    TrainNumber selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TrainNumber record);

    int updateByPrimaryKey(TrainNumber record);
}