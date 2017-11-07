package com.stu.dao;

import com.stu.entity.Myclass;

public interface MyclassMapper {
    int deleteByPrimaryKey(Integer classId);

    int insert(Myclass record);

    int insertSelective(Myclass record);

    Myclass selectByPrimaryKey(Integer classId);

    int updateByPrimaryKeySelective(Myclass record);

    int updateByPrimaryKey(Myclass record);
}