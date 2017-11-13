package com.stu.service;

import com.stu.dto.R;
import com.stu.entity.SUser;

import javax.servlet.http.HttpSession;

/**
 * Created by Administrator on 2017/11/13.
 */
public interface StudentService {
     R<?> login(SUser user, HttpSession session );
}
