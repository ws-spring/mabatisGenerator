package com.dong.dao;

import com.dong.bean.CasePersonRelation;

public interface CasePersonRelationMapper {
    int deleteByPrimaryKey(Long id);

    int insert(CasePersonRelation record);

    int insertSelective(CasePersonRelation record);

    CasePersonRelation selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CasePersonRelation record);

    int updateByPrimaryKey(CasePersonRelation record);
}