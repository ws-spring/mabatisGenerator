package com.dong.dao;

import com.dong.bean.CaseHandleInfor;

public interface CaseHandleInforMapper {
    int insert(CaseHandleInfor record);

    int insertSelective(CaseHandleInfor record);
}