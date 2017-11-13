package com.stu.utils;

import com.stu.entity.SUser;

import javax.servlet.http.HttpSession;

/**
 * Created by Administrator on 2017/11/13.
 */
public class ServletUtils {
    private static final String LOGIN_USER_INFO= "user_info";

    public static Object getUserInfo(HttpSession session) {
        if (session != null) {
            return session.getAttribute(LOGIN_USER_INFO);
        }
        return null;
    }

    public static void setUserInfo(HttpSession session, SUser userInfo) {
        session.setAttribute(LOGIN_USER_INFO, userInfo);
    }
}
