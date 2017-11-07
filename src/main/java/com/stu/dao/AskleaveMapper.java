package com.stu.dao;

import com.stu.entity.Askleave;

public interface AskleaveMapper {
    int deleteByPrimaryKey(Integer leaveId);

    int insert(Askleave record);

    int insertSelective(Askleave record);

    Askleave selectByPrimaryKey(Integer leaveId);

    int updateByPrimaryKeySelective(Askleave record);

    int updateByPrimaryKey(Askleave record);
}