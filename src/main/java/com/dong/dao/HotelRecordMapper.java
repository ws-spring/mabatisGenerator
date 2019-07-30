package com.dong.dao;

import com.dong.bean.HotelRecord;

public interface HotelRecordMapper {
    int deleteByPrimaryKey(Long id);

    int insert(HotelRecord record);

    int insertSelective(HotelRecord record);

    HotelRecord selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(HotelRecord record);

    int updateByPrimaryKey(HotelRecord record);
}