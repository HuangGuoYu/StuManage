package com.stu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Created by Administrator on 2017/11/13.
 */
@Controller
public class BaseController {
    private HttpServletRequest request;
    private HttpServletResponse response;
    private HttpSession session;

    @ModelAttribute
    public void getRelativeObject(HttpServletRequest request, HttpServletResponse response) {
        this.request = request;
        this.response = response;
        this.session = this.request.getSession();
    }
}
