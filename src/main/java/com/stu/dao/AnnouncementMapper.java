package com.stu.dao;

import com.stu.entity.Announcement;

public interface AnnouncementMapper {
    int deleteByPrimaryKey(Integer acId);

    int insert(Announcement record);

    int insertSelective(Announcement record);

    Announcement selectByPrimaryKey(Integer acId);

    int updateByPrimaryKeySelective(Announcement record);

    int updateByPrimaryKey(Announcement record);
}