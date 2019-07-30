package com.dong.dao;

import com.dong.bean.DictTypeInfor;

public interface DictTypeInforMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DictTypeInfor record);

    int insertSelective(DictTypeInfor record);

    DictTypeInfor selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DictTypeInfor record);

    int updateByPrimaryKey(DictTypeInfor record);
}