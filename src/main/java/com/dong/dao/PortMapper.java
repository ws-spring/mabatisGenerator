package com.dong.dao;

import com.dong.bean.Port;

public interface PortMapper {
    int deleteByPrimaryKey(Long portId);

    int insert(Port record);

    int insertSelective(Port record);

    Port selectByPrimaryKey(Long portId);

    int updateByPrimaryKeySelective(Port record);

    int updateByPrimaryKey(Port record);
}