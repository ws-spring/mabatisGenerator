package com.dong.dao;

import com.dong.bean.InternetCafeRecord;

public interface InternetCafeRecordMapper {
    int deleteByPrimaryKey(Long id);

    int insert(InternetCafeRecord record);

    int insertSelective(InternetCafeRecord record);

    InternetCafeRecord selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(InternetCafeRecord record);

    int updateByPrimaryKey(InternetCafeRecord record);
}