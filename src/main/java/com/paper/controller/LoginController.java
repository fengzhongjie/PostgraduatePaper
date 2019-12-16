package com.paper.controller;

import com.paper.model.User;
import com.paper.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.jws.soap.SOAPBinding;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/user")
@SessionAttributes("user")
public class LoginController {
    @Autowired
    @Qualifier("userServiceImpl")
    private UserService userService;

    //正常访问login页面
    @RequestMapping("/login")
    public String login(){
        return "login";
    }
    //表单提交过来的路径
    @RequestMapping("/checkLogin")
    public String checkLogin(User user, Model model){
        //调用service方法
        user = userService.checkLogin(user.getUserId(), user.getPassword());
        //若有user则添加到model里并且跳转到成功页面
        if(user != null){
            model.addAttribute("user",user);
            switch (user.getRole()) {
                case 0:
                    return "AdminTeacher/homePage";
                case 1:
                    return "Teacher/homePage";
                case 2:
                    return "Student/homePage";
            }
        }
        return "login";
    }

}
