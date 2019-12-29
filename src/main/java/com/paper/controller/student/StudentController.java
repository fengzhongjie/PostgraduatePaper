package com.paper.controller.student;

import com.paper.model.Student;
import com.paper.model.User;
import com.paper.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/student")
public class StudentController {

    @Autowired
    @Qualifier("studentServiceImpl")
    private StudentService studentService;

    @RequestMapping("/getstudentinfo")
    public String getStudentInfo(HttpSession httpSession,Model model){
        User user =(User) httpSession.getAttribute("user");
        Student student = studentService.selectByPrimaryKey(user.getUserId());
        model.addAttribute("student",student);
        return "/Student/personinfo";
    }




}
