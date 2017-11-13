package com.stu.dao;

import com.stu.entity.SUser;
import org.apache.ibatis.annotations.Param;

public interface SUserMapper {
    int deleteByPrimaryKey(Integer sId);

    int insert(SUser record);

    int insertSelective(SUser record);

    SUser selectByPrimaryKey(Integer sId);

    int updateByPrimaryKeySelective(SUser record);

    int updateByPrimaryKey(SUser record);

    SUser selectByAcount(@Param("acount") String acount);
}