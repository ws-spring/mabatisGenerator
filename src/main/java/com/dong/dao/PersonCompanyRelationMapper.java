package com.dong.dao;

import com.dong.bean.PersonCompanyRelation;

public interface PersonCompanyRelationMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PersonCompanyRelation record);

    int insertSelective(PersonCompanyRelation record);

    PersonCompanyRelation selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PersonCompanyRelation record);

    int updateByPrimaryKey(PersonCompanyRelation record);
}