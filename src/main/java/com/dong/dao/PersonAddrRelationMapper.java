package com.dong.dao;

import com.dong.bean.PersonAddrRelation;

public interface PersonAddrRelationMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PersonAddrRelation record);

    int insertSelective(PersonAddrRelation record);

    PersonAddrRelation selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PersonAddrRelation record);

    int updateByPrimaryKey(PersonAddrRelation record);
}