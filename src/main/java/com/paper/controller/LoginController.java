package com.paper.controller;

import com.paper.model.Student;
import com.paper.model.Teacher;
import com.paper.model.User;
import com.paper.service.StudentService;
import com.paper.service.TeacherService;
import com.paper.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@RequestMapping("/user")
@SessionAttributes(value = "user")
public class LoginController {
    @Autowired
    @Qualifier("userServiceImpl")
    private UserService userService;
    @Autowired
    @Qualifier("teacherServiceImpl")
    private TeacherService teacherService;
    @Autowired
    @Qualifier("studentServiceImpl")
    private StudentService studentService;

    //正常访问login页面
    @RequestMapping("/login")
    public String login(){
        return "login";
    }
    //表单提交过来的路径
    @RequestMapping("/checkLogin")
    public String checkLogin(String username, String password, Model model) {
        User user = userService.checkLogin(username, password);
        if (user != null) {
            model.addAttribute("user", user);
            if(user.getRole() == 0) {
                Teacher adminteacher = teacherService.selectByPrimaryKey(username);
                model.addAttribute("teacher", adminteacher);
                return "AdminTeacher/homepage";
            }else if (user.getRole()==1) {
                Teacher teacher = teacherService.selectByPrimaryKey(username);
                model.addAttribute("teacher", teacher);
                return "Teacher/homepage";
            }else {
                Student student = studentService.selectByPrimaryKey(username);
                model.addAttribute("student", student);
                return "Student/homepage";
            }
        }
        else 
            return "/login";
    }
}
