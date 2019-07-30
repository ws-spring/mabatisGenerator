package com.dong.dao;

import com.dong.bean.CommunityKickDrugRecord;

public interface CommunityKickDrugRecordMapper {
    int deleteByPrimaryKey(Long id);

    int insert(CommunityKickDrugRecord record);

    int insertSelective(CommunityKickDrugRecord record);

    CommunityKickDrugRecord selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CommunityKickDrugRecord record);

    int updateByPrimaryKey(CommunityKickDrugRecord record);
}