package com.dong.dao;

import com.dong.bean.Car;

public interface CarMapper {
    int insert(Car record);

    int insertSelective(Car record);
}