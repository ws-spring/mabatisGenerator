package com.dong.dao;

import com.dong.bean.City;

public interface CityMapper {
    int deleteByPrimaryKey(Long cityCode);

    int insert(City record);

    int insertSelective(City record);

    City selectByPrimaryKey(Long cityCode);

    int updateByPrimaryKeySelective(City record);

    int updateByPrimaryKey(City record);
}