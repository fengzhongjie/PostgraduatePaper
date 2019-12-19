package com.paper.controller;

import com.paper.model.User;
import com.paper.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

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
    public ModelAndView checkLogin(User user){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/login");
        user = userService.checkLogin(user.getUserId(), user.getPassword());
        if(user != null){
            modelAndView.addObject("userid",user);
            switch (user.getRole()) {
                case 0:
                    modelAndView.setViewName("/AdminTeacher/homepage");
                    break;
                case 1:
                    modelAndView.setViewName("/Teacher/homepage");
                    break;
                case 2:
                    modelAndView.setViewName("/Student/homepage");
                    break;
            }
        }
        return modelAndView;
    }

}
