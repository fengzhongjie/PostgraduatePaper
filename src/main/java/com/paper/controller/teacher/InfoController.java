package com.paper.controller.teacher;

import com.paper.model.*;
import com.paper.service.TcService;
import com.paper.service.TeacherService;
import com.paper.service.impl.TcServiceImpl;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/teacher")
public class InfoController {
    @Autowired
    @Qualifier("teacherServiceImpl")
    private TeacherService teacherService;


    @RequestMapping("/getPersonalInfo")
    public String getPersonalAllInfo(HttpSession httpSession,Model model){

        User user= (User)httpSession.getAttribute("user");
        Teacher teacher=teacherService.selectByPrimaryKey(user.getUserId());
        model.addAttribute(teacher);
        return "Teacher/personalinfo";
    }

    @RequestMapping("/getCourseInfo")
    public String getCourseInfo(HttpSession httpSession,Model model){
        User user = (User)httpSession.getAttribute("user");
        Teacher teacher = teacherService.selectByPrimaryKey(user.getUserId());
        TcService tcService = new TcServiceImpl();
        List<String> courseList = tcService.selectByTeacherid(teacher.getTeacherId());

        model.addAttribute("courseList",courseList);

        return "Teacher/courseinfo";
    }



}
