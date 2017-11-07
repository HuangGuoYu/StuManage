package com.stu.dao;

import com.stu.entity.signIn;

public interface signInMapper {
    int deleteByPrimaryKey(String sgId);

    int insert(signIn record);

    int insertSelective(signIn record);

    signIn selectByPrimaryKey(String sgId);

    int updateByPrimaryKeySelective(signIn record);

    int updateByPrimaryKey(signIn record);
}