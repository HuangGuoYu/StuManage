package com.stu.controller.mobile;

import com.stu.controller.BaseController;
import com.stu.dto.R;
import com.stu.entity.SUser;
import com.stu.service.StudentService;
import com.stu.service.impl.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

/**
 * Created by Administrator on 2017/11/13.
 */
@Controller
@RequestMapping("/mobile")
public class LoginController extends BaseController {

    @Autowired
    StudentService service;

    @Autowired
    RedisTemplate<String, String> redisTemplate;

    /**
     * 登录页面
     * @return
     */
    @RequestMapping("/loginPage")
    public String jumpToLoginPage() {
        redisTemplate.opsForValue().set("huang", "guoyu");
        return "loginPage";
    }
    /**
     * 登录处理逻辑
     * @param user
     * @return
     */
    @RequestMapping("/login")
    @ResponseBody
    public R<?> login(SUser user, HttpSession session) {
        return service.login(user, session);
    }
}
