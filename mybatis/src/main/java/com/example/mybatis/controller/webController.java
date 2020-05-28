package com.example.mybatis.controller;

import com.example.mybatis.entity.homework;
import com.example.mybatis.entity.student;
import com.example.mybatis.entity.stuhom;
import com.example.mybatis.service.StuService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RequestMapping("/")
@Controller
public class webController {
    StuService stuService;

    public webController(StuService stuService){
        this.stuService=stuService;
    }

    public String test(){
        return "/index.jsp";
    }

}
