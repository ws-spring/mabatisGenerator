package com.dong.dao;

import com.dong.bean.PersonPassPortRecord;

public interface PersonPassPortRecordMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PersonPassPortRecord record);

    int insertSelective(PersonPassPortRecord record);

    PersonPassPortRecord selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PersonPassPortRecord record);

    int updateByPrimaryKey(PersonPassPortRecord record);
}