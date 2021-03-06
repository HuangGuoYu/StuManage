package com.stu.controller.mobile;

import com.stu.controller.BaseController;
import com.stu.dto.R;
import com.stu.entity.SUser;
import com.stu.service.StudentService;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * Created by Administrator on 2017/11/13.
 */
@Controller
@RequestMapping("/mobile")
public class LoginController extends BaseController {

    /** 2017.11.14
     * service
     */
    @Autowired
    private StudentService service;

    @Autowired
    private RedisTemplate<String, String> redisTemplate;

    /** 2017.11.14
     * 登录页面
     * @return
     */
    @RequestMapping("/loginPage")
    public String jumpToLoginPage() {
        redisTemplate.opsForValue().set("huang", "guoyu");
        return "login/login";
    }
    /** 2017.11.14
     * 登录处理逻辑
     * @param user entity
     * @return r
     */

    @RequestMapping("/login")
    @ResponseBody
    public R<?> login(SUser user, HttpSession session) {
        return service.login(user, session);
    }

    }
