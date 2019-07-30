package com.dong.dao;

import com.dong.bean.ForceKickDrugRecord;

public interface ForceKickDrugRecordMapper {
    int insert(ForceKickDrugRecord record);

    int insertSelective(ForceKickDrugRecord record);
}