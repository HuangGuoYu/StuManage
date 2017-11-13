package com.stu.service.impl;

import com.stu.dao.SUserMapper;
import com.stu.dto.R;
import com.stu.entity.SUser;
import com.stu.service.StudentService;
import com.stu.utils.ServletUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;

/**
 * Created by Administrator on 2017/11/13.
 */
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    SUserMapper stuService;

    public R<?> login(SUser user, HttpSession session) {
        SUser sUser = stuService.selectByAcount(user.getsUsername());
        if (sUser != null && sUser.getsPassword().equals(user.getsPassword())) {
            ServletUtils.setUserInfo(session, sUser);
            return new R().ok(sUser);
        }
        return new R().error("用户不存在或密码错误");
    }

}
