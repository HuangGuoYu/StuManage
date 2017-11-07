package com.stu.dao;

import com.stu.entity.Positioning;

public interface PositioningMapper {
    int deleteByPrimaryKey(String positId);

    int insert(Positioning record);

    int insertSelective(Positioning record);

    Positioning selectByPrimaryKey(String positId);

    int updateByPrimaryKeySelective(Positioning record);

    int updateByPrimaryKey(Positioning record);
}