package com.stu.controller;

import com.stu.dto.R;
import com.stu.entity.SUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Administrator on 2017/11/7.
 */
@Controller
public class TestController {

    @Autowired com.stu.service.impl.test service;
    @RequestMapping("/hello")
    @ResponseBody
    public String hello() {
        return new String("hello world");
    }

    /**
     * testdatabase connection
     * @return a
     */
    @RequestMapping("/database")
    @ResponseBody
    public R<?> getData() {
        return new R<SUser>().ok(service.getData());
    }

    @RequestMapping("/ftl")
    public ModelAndView ftl(ModelAndView mv) {
        mv.addObject("var", "hello world ftl");
        mv.setViewName("loginPage1");
        return mv;
    }
}
