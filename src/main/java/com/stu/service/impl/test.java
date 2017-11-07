package com.stu.service.impl;

import com.stu.dao.SUserMapper;
import com.stu.entity.SUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/11/7.
 */
@Service
public class test implements com.stu.service.test {
    @Autowired
    SUserMapper dao;

    public SUser getData() {
        return dao.selectByPrimaryKey(1);
    }
}
