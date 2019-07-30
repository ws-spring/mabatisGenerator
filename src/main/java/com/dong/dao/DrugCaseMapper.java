package com.dong.dao;

import com.dong.bean.DrugCase;

public interface DrugCaseMapper {
    int deleteByPrimaryKey(Long id);

    int insert(DrugCase record);

    int insertSelective(DrugCase record);

    DrugCase selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(DrugCase record);

    int updateByPrimaryKey(DrugCase record);
}