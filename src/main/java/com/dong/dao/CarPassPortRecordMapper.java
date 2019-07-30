package com.dong.dao;

import com.dong.bean.CarPassPortRecord;

public interface CarPassPortRecordMapper {
    int deleteByPrimaryKey(Long id);

    int insert(CarPassPortRecord record);

    int insertSelective(CarPassPortRecord record);

    CarPassPortRecord selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CarPassPortRecord record);

    int updateByPrimaryKey(CarPassPortRecord record);
}