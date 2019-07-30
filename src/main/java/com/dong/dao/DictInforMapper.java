package com.dong.dao;

import com.dong.bean.DictInfor;

public interface DictInforMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DictInfor record);

    int insertSelective(DictInfor record);

    DictInfor selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DictInfor record);

    int updateByPrimaryKey(DictInfor record);
}