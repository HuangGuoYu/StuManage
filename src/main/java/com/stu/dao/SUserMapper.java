package com.stu.dao;

import com.stu.entity.SUser;

public interface SUserMapper {
    int deleteByPrimaryKey(Integer sId);

    int insert(SUser record);

    int insertSelective(SUser record);

    SUser selectByPrimaryKey(Integer sId);

    int updateByPrimaryKeySelective(SUser record);

    int updateByPrimaryKey(SUser record);
}