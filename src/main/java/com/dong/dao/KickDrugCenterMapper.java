package com.dong.dao;

import com.dong.bean.KickDrugCenter;

public interface KickDrugCenterMapper {
    int deleteByPrimaryKey(Long id);

    int insert(KickDrugCenter record);

    int insertSelective(KickDrugCenter record);

    KickDrugCenter selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(KickDrugCenter record);

    int updateByPrimaryKey(KickDrugCenter record);
}