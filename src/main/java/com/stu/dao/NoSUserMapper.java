package com.stu.dao;

import com.stu.entity.NoSUser;

public interface NoSUserMapper {
    int deleteByPrimaryKey(Integer nsId);

    int insert(NoSUser record);

    int insertSelective(NoSUser record);

    NoSUser selectByPrimaryKey(Integer nsId);

    int updateByPrimaryKeySelective(NoSUser record);

    int updateByPrimaryKey(NoSUser record);
}