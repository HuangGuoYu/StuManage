package com.stu.dao;

import com.stu.entity.Electives;

public interface ElectivesMapper {
    int deleteByPrimaryKey(Integer eleId);

    int insert(Electives record);

    int insertSelective(Electives record);

    Electives selectByPrimaryKey(Integer eleId);

    int updateByPrimaryKeySelective(Electives record);

    int updateByPrimaryKey(Electives record);
}