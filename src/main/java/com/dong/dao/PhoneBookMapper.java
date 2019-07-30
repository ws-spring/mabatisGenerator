package com.dong.dao;

import com.dong.bean.PhoneBook;

public interface PhoneBookMapper {
    int insert(PhoneBook record);

    int insertSelective(PhoneBook record);
}